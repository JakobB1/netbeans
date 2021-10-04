/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.util;

import com.github.javafaker.Faker;
import hr.edunova.zavrsnihib.model.Djelatnik;
import hr.edunova.zavrsnihib.model.Korisnik;
import hr.edunova.zavrsnihib.model.Operater;
import hr.edunova.zavrsnihib.model.Pcshop;
import hr.edunova.zavrsnihib.model.Proizvod;
import hr.edunova.zavrsnihib.model.Racun;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jalep
 */
public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao(){
        Session s = HibernateUtil.getSession();
        
        //prije rada s hibernate zapoceti transakciju
        s.beginTransaction();
        
        
        
        
        Operater o = new Operater();
        o.setIme("Edunova");
        o.setPrezime("Operater");
        o.setEmail("operaterpc@edunova.hr");
        o.setLozinka(BCrypt.hashpw("o", BCrypt.gensalt()));
        
        s.save(o);
        
        
        
        
        Pcshop pcshop = new Pcshop();
        pcshop.setNaziv("Edunova PC");
        pcshop.setVlasnik("Ivo");
        pcshop.setOib("12345678911");
        pcshop.setIban("HR12345");
        pcshop.setCertifikat(true);
        
        s.save(pcshop);
        
        
        
        
        Faker faker = new Faker();
        Djelatnik djelatnik = new Djelatnik();
        djelatnik.setIme(faker.name().firstName());
        djelatnik.setPrezime(faker.name().firstName());
        djelatnik.setOib("12345678911");
        djelatnik.setEmail("email@mail.hr");
        djelatnik.setIban("HR12345");
        djelatnik.setBrojUgovora("/1");
        
        s.save(djelatnik);
        
        
        
        
        List<Korisnik>korisnici = new ArrayList<>();
        Korisnik korisnik;
        for(int i=0;i<20;i++){
            korisnik = new Korisnik();
            korisnik.setIme(faker.name().lastName());
            korisnik.setPrezime(faker.name().lastName());
            korisnik.setOib(EdunovaUtil.getOIB());
            
            s.save(korisnik);
        }
        
        
        
        
        /*
        List<Proizvod>proizvodi = new ArrayList<>();
        Proizvod proizvod;
        for(int i=0;i<20;i++){
            proizvod = new Proizvod();
            proizvod.setNaziv("Naziv proizvoda");
            proizvod.setCijena(new BigDecimal(99.99));
            proizvod.setDostupnost(true);
            proizvod.setGarancija(new Date());
            proizvod.setKodArtikla("BB123");
            proizvod.setOpisProizvoda("Opis");
            
        s.save(proizvod);
        }
        */
        
        
        
        
        Racun racun = new Racun();
        racun.setBrojRacuna("1");
        racun.setDjelatnik(djelatnik);
        racun.setCijena(BigDecimal.TEN);
        racun.setIznos(BigDecimal.TEN);
        racun.setKolicina("1");
        racun.setNacinPlacanja("Gotovina");
        
        s.save(racun);
        
        
        
        
        // Proizvodi unos
        
        Proizvod ryzen5 = new Proizvod();
        ryzen5.setNaziv("Ryzen 5");
        ryzen5.setCijena(new BigDecimal(1699.99));
        ryzen5.setDostupnost(true);
        ryzen5.setOpisProizvoda("Procesor");
        ryzen5.setKodArtikla("RZ001");
        ryzen5.setGarancija(new Date());
        
        
        s.save(ryzen5);
        
        //commit ide na kraju
        s.getTransaction().commit();
        
    }
    
}