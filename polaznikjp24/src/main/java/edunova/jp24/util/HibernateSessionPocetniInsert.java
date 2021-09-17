/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import com.github.javafaker.Faker;
import edunova.jp24.model.Grupa;
import edunova.jp24.model.Operater;
import edunova.jp24.model.Polaznik;
import edunova.jp24.model.Predavac;
import edunova.jp24.model.Smjer;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;



public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao() {
        Session s = HibernateUtil.getSession();
        
        // prije rada s hibernate zapoceti transakciju
        s.beginTransaction();
        
        Operater o = new Operater();
        o.setIme("Edunova");
        o.setPrezime("Operater");
        o.setEmail("operater@edunova.hr");
        o.setLozinka("Mojalozinka123.");
        
        Smjer java = new Smjer();
        java.setNaziv("Java programiranje");
        s.save(java);
        
        
        Faker faker = new Faker();
        Predavac predavac = new Predavac();
        predavac.setIme(faker.name().firstName());
        predavac.setPrezime(faker.name().lastName());
        
        s.save(predavac);
        
        List<Polaznik> polaznici = new ArrayList<>();
        
        Polaznik polaznik;
        for(int i=0;i<1300;i++) {
            polaznik = new Polaznik();
            polaznik.setIme(faker.name().firstName());
            polaznik.setPrezime(faker.name().lastName());
            polaznik.setOib(EdunovaUtil.getOIB());
            s.save(polaznik);
            //if(i%100==0) {
            if(i<27){
                polaznici.add(polaznik);
            }
            //}
        }
        
        Grupa grupa = new Grupa();
        grupa.setNaziv("JP24");
        grupa.setPredavac(predavac);
        grupa.setPolaznici(polaznici);
        
        s.save(grupa);
                
        // commit ide na kraju
        s.getTransaction().commit();
        
        
        
        /*s.beginTransaction();
        
        for(int i=1;i<=100;i++) {
            Smjer smjer = new Smjer();
            smjer.setNaziv("Smjer " + i);
            s.save(smjer);
        }
        
        s.getTransaction().commit();
        */
        
    }
}    