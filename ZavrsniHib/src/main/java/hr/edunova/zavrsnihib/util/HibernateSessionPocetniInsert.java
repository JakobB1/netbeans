/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.util;

import com.github.javafaker.Faker;
import hr.edunova.zavrsnihib.model.Djelatnik;
import hr.edunova.zavrsnihib.model.Korisnik;
import hr.edunova.zavrsnihib.model.Pcshop;
import hr.edunova.zavrsnihib.model.Proizvod;
import hr.edunova.zavrsnihib.model.Racun;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao(){
        Session s = HibernateUtil.getSession();
        
        //prije rada s hibernate zapoceti transakciju
        s.beginTransaction();
        
        
        
        Pcshop java = new Pcshop();
        java.setNaziv("Edunova PC");
        s.save(java);
        
        Faker faker = new Faker();
        Djelatnik djelatnik = new Djelatnik();
        djelatnik.setIme(faker.name().lastName());
        djelatnik.setPrezime(faker.name().lastName());
        
        s.save(djelatnik);
        
        
        List<Korisnik>korisnici = new ArrayList<>();
        Korisnik korisnik;
        for(int i=0;i<1300;i++){
            korisnik = new Korisnik();
            korisnik.setIme(faker.name().lastName());
            korisnik.setPrezime(faker.name().lastName());
            
            s.save(korisnik);
        }
        
        Proizvod proizvod = new Proizvod();
        proizvod.setNaziv("Razer Tipkovnica");
        
        s.save(proizvod);
        
        
        
        Racun racun = new Racun();
        racun.setBrojRacuna("123");
        racun.setDjelatnik(djelatnik);
        racun.setCijena(BigDecimal.TEN);
        racun.setIznos(BigDecimal.TEN);
        racun.setKolicina("100");
        racun.setNacinPlacanja("Karticno");
        racun.setKorisnici(korisnici);
        racun.setProizvod(proizvod);
        
        s.save(racun);
        
        //commit ide na kraju
        s.getTransaction().commit();
        
    }
    
}
