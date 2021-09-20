/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc;

import hr.edunova.pcshopmvc.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public class Start {
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        Session s = HibernateUtil.getSession();
        
        s.beginTransaction();
        
        
        
        
        
        
        s.getTransaction().commit();
        
    }
}
