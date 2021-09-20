/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.util;

import hr.edunova.pcshopmvc.contoller.ObradaPcshop;
import hr.edunova.pcshopmvc.model.Korisnik;
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
        
        List<Korisnik> korisnici;
        
        // konkretno Korisnik u ovom primjeru mora biti veliko slovo P
        // Obracas se klasi a ne tablici u bazi
        korisnici = s.createQuery("from Korisnik").list();
        
        //for(Polaznik p : polaznici) {
        //    System.out.println(p.getIme() + " " + p.getPrezime());
        //}
        
        // 5. nacin interacije podataka
        // https://www.baeldung.com/foreach-java
        korisnici.forEach(p->
        {System.out.println(p.getIme()+ " " + p.getPrezime());
        });
        
        // ucitati ce polaznika s id 23
        Korisnik k = s.load(Korisnik.class, (long)23);
        
        k.setEmail("pero@edunova.hr");
        
        s.beginTransaction();
        s.save(k);
        
        //s.delete(p);
        
        s.getTransaction().commit();
        
        
        
    }
    
    public static void radSControllerKlasom(){
        new ObradaPcshop().read().forEach(p->{
            System.out.println(p.getNaziv());
        });
        
    }
    
}