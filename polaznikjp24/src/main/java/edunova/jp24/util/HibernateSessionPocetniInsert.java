/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import com.github.javafaker.Faker;
import edunova.jp24.model.Clan;
import edunova.jp24.model.Grupa;
import edunova.jp24.model.Operater;
import edunova.jp24.model.Polaznik;
import edunova.jp24.model.Predavac;
import edunova.jp24.model.Smjer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;



public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao() {
        Session s = HibernateUtil.getSession();
        
        // prije rada s hibernate zapoceti transakciju
        s.beginTransaction();
        
        Operater o = new Operater();
        o.setIme("Edunova");
        o.setPrezime("Operater");
        o.setEmail("operater@edunova.hr");
        o.setLozinka(BCrypt.hashpw("o", BCrypt.gensalt()));
        
        s.save(o);

        Smjer java = new Smjer();
        java.setNaziv("Java programiranje");
        java.setTrajanje(130);
        java.setCertifikat(true);
        java.setCijena(new BigDecimal(5999.99));
        s.save(java);

        Faker faker = new Faker();
        Predavac predavac = new Predavac();
        predavac.setIme(faker.name().firstName());
        predavac.setPrezime(faker.name().lastName());
        predavac.setEmail("email@mail.hr");
        predavac.setOib("11111111111");
        predavac.setIban("HR545454");
        
         s.save(predavac);
         
          Grupa grupa = new Grupa();
        grupa.setNaziv("JP24");
        grupa.setSmjer(java);
        grupa.setPredavac(predavac);
        grupa.setDatumPocetka(new Date());
        
        s.save(grupa);
         
         List<Clan> clanovi = new ArrayList<>();

        Polaznik polaznik;
        Clan clan;
        for (int i = 0; i < 27; i++) {
            clan=new Clan();
            polaznik = new Polaznik();
            polaznik.setIme(faker.name().firstName());
            polaznik.setPrezime(faker.name().lastName());
            polaznik.setOib(EdunovaUtil.getOIB());
            s.save(polaznik);
            clan.setPolaznik(polaznik);
            clan.setGrupa(grupa);
            clan.setKalorije(200);
            s.save(clan);
        }
                
        // commit ide na kraju
        s.getTransaction().commit();
    }
}    