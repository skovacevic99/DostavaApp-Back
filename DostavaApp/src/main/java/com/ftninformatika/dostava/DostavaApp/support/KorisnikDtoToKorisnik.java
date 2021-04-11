package com.ftninformatika.dostava.DostavaApp.support;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.dostava.DostavaApp.model.Korisnik;
import com.ftninformatika.dostava.DostavaApp.service.KorisnikService;
import com.ftninformatika.dostava.DostavaApp.web.dto.KorisnikDTO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Component
public class KorisnikDtoToKorisnik implements Converter<KorisnikDTO, Korisnik> {

    @Autowired
    private KorisnikService korisnikService;

    @Override
    public Korisnik convert(KorisnikDTO korisnikDTO) {
        Korisnik entity = null;

        if(korisnikDTO.getId() == null) {
            entity = new Korisnik();
        }else {
            Optional<Korisnik> korisnikOptional = korisnikService.findOne(korisnikDTO.getId());
            if(korisnikOptional.isPresent()){
                entity = korisnikOptional.get();
            }
        }

        if(entity != null) {
            entity.setKorisnickoIme(korisnikDTO.getKorisnickoIme());
            entity.seteMail(korisnikDTO.geteMail());
            entity.setIme(korisnikDTO.getIme());
            entity.setPrezime(korisnikDTO.getPrezime());
        }

        return entity;
    }

}
