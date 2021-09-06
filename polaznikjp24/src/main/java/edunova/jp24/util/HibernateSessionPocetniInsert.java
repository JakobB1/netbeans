/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import com.github.javafaker.Faker;
import edunova.jp24.model.Polaznik;
import edunova.jp24.model.Predavac;
import edunova.jp24.model.Smjer;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao() {
        Session s = HibernateUtil.getSession();
        
        // prije rada s hibernate zapoceti transakciju
        s.beginTransaction();
        
        
        Smjer java = new Smjer();
        java.setNaziv("Java programiranje");
        s.save(java);
        
        Faker faker = new Faker();
        Predavac predavac  = new Predavac();
        predavac.setIme(faker.name().firstName());
        predavac.setPrezime(faker.name().lastName());
        
        s.save(predavac);
        
        
        
        Polaznik polaznik;
        for (int i = 0; i < 1300; i++) {
            polaznik = new Polaznik();
            polaznik.setIme(faker.name().firstName());
            polaznik.setPrezime(faker.name().lastName());
            s.save(polaznik);
        }
        
        
        /*
        for(int i = 1; i<=100; i++) {
            Smjer smjer = new Smjer();
            smjer.getNaziv("Smjer" + i);
            s.save(smjer);
        }*/
        
        
                
        // commit ide na kraju        
        s.getTransaction().commit();
    }
    
}