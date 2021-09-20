/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.util;

import com.github.javafaker.Faker;
import hr.edunova.pcshopmvc.model.Korisnik;
import hr.edunova.pcshopmvc.model.Pcshop;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao(){
        Session s = HibernateUtil.getSession();
        
        s.beginTransaction();
        
        /*
        Pcshop shop = new Pcshop();
        shop.setNaziv("Links");
        s.save(shop);
        */
        
        /*
        Faker faker = new Faker();
        Korisnik korisnik = new Korisnik();
        korisnik.setIme(faker.name().firstName());
        korisnik.setPrezime(faker.name().lastName());
        s.save(korisnik);
        */
        
        /*
        Pcshop pcshop;
        for(int i=0;i<1300;i++){
            pcshop = new Pcshop();
            pcshop.setOib(EdunovaUtil.getOIB());
            s.save(pcshop);
        }
        */    
        
        /*
        Faker faker = new Faker();
        Korisnik korisnik;
        for(int i=0;i<1300;i++){
            korisnik = new Korisnik();
            korisnik.setIme(faker.name().firstName());
        korisnik.setPrezime(faker.name().lastName());
        s.save(korisnik);
        }
        */
        
        /*
        for(int i=1;i<100;i++){
            Pcshop pcshop = new Pcshop();
            pcshop.setNaziv("Pcshop" + i);
            s.save(pcshop);
        }
        */
        
        s.getTransaction().commit();
        
    }
}
    

