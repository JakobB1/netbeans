/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

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
        
        // konkretno Smjer u ovom primjeru mora biti veliko slovo S
        // Obracas se klasi a ne tablici u bazi
        polaznici = s.createQuery("from Smjer").list();
        
        
        
    }
    
}
