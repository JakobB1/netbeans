/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import org.hibernate.Session;



public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao() {
        Session s = HibernateUtil.getSession();
        
        // prije rada s hibernate zapoceti transakciju
        s.beginTransaction();
        
        
        
        
        // commit ide na kraju
        s.getTransaction().commit();
        
        
    }
    
}