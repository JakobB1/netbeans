/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.util;

import hr.edunova.zavrsnihib.model.Korisnik;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public class IzlistanjeObjekataIzBaze {
    
    
    public static void odradiPosao(){
        
        Session s = HibernateUtil.getSession();
        
        List<Korisnik> korisnici;
        
        korisnici = s.createQuery("from Korisnik").list();
        
        
        //for(Korisnik k : korisnici){
        //   System.out.println(k.getIme() + " " + k.getPrezime());
        //}
        
        //5. nacin interacije podataka
        korisnici.forEach((k->{
            System.out.println(k.getIme() + " " + k.getPrezime());
        }));
        
        // ucitati ce polaznika s id 23 
        Korisnik k = s.load(Korisnik.class, (long)23);
        
        k.setEmail("pero@edunova.hr");
        
        s.beginTransaction();
        //s.save(k);
        
        s.delete(k);
        s.getTransaction().commit();
        
        
    }
    
    
    public static void radSControllerKlasom(){
    }
    
}
