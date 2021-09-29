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
        
        Pcshop java = new Pcshop();
        java.setNaziv("Edunova PC");
        s.save(java);
        
        Faker faker = new Faker();
        Djelatnik djelatnik = new Djelatnik();
        djelatnik.setIme(faker.name().firstName());
        djelatnik.setPrezime(faker.name().firstName());
        djelatnik.setOib("12345678911");
        djelatnik.setEmail("email@mail.hr");
        djelatnik.setIban("HR12345");
        djelatnik.setBrojUgovora("1");
        
        s.save(djelatnik);
        
        
        List<Korisnik>korisnici = new ArrayList<>();
        Korisnik korisnik;
        for(int i=0;i<1300;i++){
            korisnik = new Korisnik();
            korisnik.setIme(faker.name().lastName());
            korisnik.setPrezime(faker.name().lastName());
            korisnik.setOib(EdunovaUtil.getOIB());
            
            s.save(korisnik);
        }
        
        Proizvod proizvod = new Proizvod();
        proizvod.setNaziv("Razer Tipkovnica");
        proizvod.setGarancija(new Date());
        
        s.save(proizvod);
        
        
        
        Racun racun = new Racun();
        racun.setBrojRacuna("123");
        racun.setDjelatnik(djelatnik);
        racun.setCijena(BigDecimal.TEN);
        racun.setIznos(BigDecimal.TEN);
        racun.setKolicina("100");
        racun.setNacinPlacanja("Karticno");
        
        racun.setProizvod(proizvod);
        
        
        s.save(racun);
        
        //commit ide na kraju
        s.getTransaction().commit();
        
    }
    
}
