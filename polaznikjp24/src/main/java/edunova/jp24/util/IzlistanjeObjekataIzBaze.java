/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import edunova.jp24.controller.ObradaSmjer;
import edunova.jp24.model.Polaznik;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public class IzlistanjeObjekataIzBaze {
    
    
    public static void odradiPosao() {
        
        Session s = HibernateUtil.getSession();
        
        // HQL 
        // https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/queryhql.html
        
        List<Polaznik> polaznici;
        
        // konkretno Polaznik u ovom primjeru mora biti veliko slovo P
        // Obracas se klasi a ne tablici u bazi
        polaznici = s.createQuery("from Polaznik").list();
        
        //for(Polaznik p : polaznici) {
        //    System.out.println(p.getIme() + " " + p.getPrezime());
        //}
        
        // 5. nacin interacije podataka
        // https://www.baeldung.com/foreach-java
        polaznici.forEach(p->
        {System.out.println(p.getIme() + " " + p.getPrezime());
        });
        
        // ucitati ce polaznika s id 23
        Polaznik p = s.load(Polaznik.class, (long)23);
        
        p.setEmail("pero@edunova.hr");
        
        s.beginTransaction();
        s.save(p);
        
        //s.delete(p);
        
        s.getTransaction().commit();
        
        
        
    }
    
    public static void radSControllerKlasom(){
        new ObradaSmjer().read().forEach(s->{
            System.out.println(s.getNaziv());
        });
        
    }
    
}
