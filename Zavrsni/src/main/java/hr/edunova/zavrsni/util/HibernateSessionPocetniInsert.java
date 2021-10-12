/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.util;

import com.github.javafaker.Faker;
import hr.edunova.zavrsni.model.Korisnik;
import hr.edunova.zavrsni.model.Operater;
import hr.edunova.zavrsni.model.Racun;
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
        
        Operater java = new Operater();
        java.setNaziv("Edunova PC Operater");
        s.save(java);
        
        
        
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
        
        s.save(racun);
        
        
        //commit ide na kraju
        s.getTransaction().commit();
    }
    
}
