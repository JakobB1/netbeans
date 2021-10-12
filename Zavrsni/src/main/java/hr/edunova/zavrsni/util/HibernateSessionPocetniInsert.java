/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.util;

import com.github.javafaker.Faker;
import hr.edunova.zavrsni.model.Korisnik;
import hr.edunova.zavrsni.model.Login;
import hr.edunova.zavrsni.model.Operater;
import hr.edunova.zavrsni.model.Racun;
import java.math.BigDecimal;
import java.util.ArrayList;
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
        
        
        Login l = new Login();
        l.setIme("Edunova PC");
        l.setPrezime("Operater");
        l.setEmail("operater@edunova.hr");
        l.setLozinka(BCrypt.hashpw("o", BCrypt.gensalt()));
        
        s.save(l);
        
        
        
        
        Operater o = new Operater();
        o.setNaziv("Edunova PC Operater");
        o.setEmail("edunova@mail.hr");
        o.setOib("12345678911");
        o.setBrojUgovora("/1");
        o.setCertifikat(true);
        
        s.save(o);
        
        
        
        
        Faker faker = new Faker();
        List<Korisnik>korisnici = new ArrayList<>();
        Korisnik korisnik;
        for(int i=0;i<5;i++){
            korisnik = new Korisnik();
            korisnik.setIme(faker.name().lastName());
            korisnik.setPrezime(faker.name().lastName());
            korisnik.setOib(EdunovaUtil.getOIB());
            
            s.save(korisnik);
        }
        
        
        
        
        Racun racun = new Racun();
        racun.setBrojRacuna("1");
        racun.setCijena(BigDecimal.TEN);
        racun.setIznos(BigDecimal.TEN);
        racun.setKolicina("1");
        racun.setNacinPlacanja("Gotovina");
        racun.setOperater(o);
        
        s.save(racun);
        
        
        //commit ide na kraju
        s.getTransaction().commit();
    }
    
}
