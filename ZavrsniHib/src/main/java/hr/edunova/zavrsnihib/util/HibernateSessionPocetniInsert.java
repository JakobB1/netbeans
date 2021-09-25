/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.util;

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
        
        
        
        //commit ide na kraju
        s.getTransaction().commit();
        
    }
    
}
