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
        
        
        
        Korisnik korisnik;
        for(int i=0;i<1300;i++){
            korisnik = new Korisnik();
            korisnik.setIme(faker.name().lastName());
            korisnik.setPrezime(faker.name().lastName());
            
            s.save(korisnik);
        }
        
        
        
        //commit ide na kraju
        s.getTransaction().commit();
        
    }
    
}
