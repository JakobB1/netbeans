/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import edunova.jp24.model.Smjer;
import org.hibernate.Session;


public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao() {
        Session s = HibernateUtil.getSession();
        
        // prije rada s hibernate zapoceti transakciju
        s.beginTransaction();
        
        for(int i = 1; i<=100; i++) {
            Smjer smjer = new Smjer();
            smjer.getNaziv("Smjer" + i);
            s.save(smjer);
        }     
        // commit ide na kraju        
        s.getTransaction().commit();
    }
    
}