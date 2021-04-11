INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (1,'miroslav@maildrop.cc','miroslav','$2y$12$NH2KM2BJaBl.ik90Z1YqAOjoPgSd0ns/bF.7WedMxZ54OhWQNNnh6','Miroslav','Simic','ADMIN');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (2,'tamara@maildrop.cc','tamara','$2y$12$DRhCpltZygkA7EZ2WeWIbewWBjLE0KYiUO.tHDUaJNMpsHxXEw9Ky','Tamara','Milosavljevic','KORISNIK');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (3,'petar@maildrop.cc','petar','$2y$12$i6/mU4w0HhG8RQRXHjNCa.tG2OwGSVXb0GYUnf8MZUdeadE4voHbC','Petar','Jovic','KORISNIK');
              
INSERT INTO dostavljac(id, jmbg, brojlk, imeiprezime) VALUES (1, 0206997822114, 345846, "Marko Markovic");
INSERT INTO dostavljac(id, jmbg, brojlk, imeiprezime) VALUES (2, 0206993512114, 545246, "Petar Markovic");
INSERT INTO dostavljac(id, jmbg, brojlk, imeiprezime) VALUES (3, 0237567822114, 225846, "Sinisa Slavkovic");
INSERT INTO dostavljac(id, jmbg, brojlk, imeiprezime) VALUES (4, 0203857822114, 155846, "Aleksandar Hardi");

INSERT INTO racun(id, broj_racuna, datum, ukupna_cena) VALUES(1, 5315125, "2020-01-01 09:00", 1650.00);
INSERT INTO racun(id, broj_racuna, datum, ukupna_cena) VALUES(2, 1315125, "2021-01-01 09:00", 650.00);
INSERT INTO racun(id, broj_racuna, datum, ukupna_cena) VALUES(3, 4315125, "2020-07-01 09:00", 1450.00);

INSERT INTO narudzba(id, br_narudzbe, cena, datum, mesto_isporuke, opis, dostavljac_id) VALUES(1, 529512521, 300.00, "2020-01-01 09:00", "Djurdjevo", "Sve full", 4);
INSERT INTO narudzba(id, br_narudzbe, cena, datum, mesto_isporuke, opis, dostavljac_id) VALUES(2, 229512521, 500.00, "2021-01-01 09:00", "Novi Sad", "Sve full", 2);
INSERT INTO narudzba(id, br_narudzbe, cena, datum, mesto_isporuke, opis, dostavljac_id, racun_id) VALUES(3, 329512521, 600.00, "2021-07-01 09:00", "Novi Sad", "Sve full", 4, 3);
INSERT INTO narudzba(id, br_narudzbe, cena, datum, mesto_isporuke, opis, dostavljac_id, racun_id) VALUES(4, 629512521, 1100.00, "2020-05-01 09:00", "Beograd", "Sve full", 1, 2);
INSERT INTO narudzba(id, br_narudzbe, cena, datum, mesto_isporuke, opis, dostavljac_id, racun_id) VALUES(5, 829512521, 1600.00, "2020-01-01 09:00", "Ledinci", "Sve full", 2, 1);