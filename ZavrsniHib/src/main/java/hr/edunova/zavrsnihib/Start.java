/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib;

import hr.edunova.zavrsnihib.util.HibernateSessionPocetniInsert;
import hr.edunova.zavrsnihib.util.HibernateUtil;
import hr.edunova.zavrsnihib.util.IzlistanjeObjekataIzBaze;
import hr.edunova.zavrsnihib.util.RadSKontrolerima;
import hr.edunova.zavrsnihib.view.SplashScreen;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public class Start {
    
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        //Session s = HibernateUtil.getSession(); 
        //IzlistanjeObjekataIzBaze.odradiPosao();
        //IzlistanjeObjekataIzBaze.radSControllerKlasom();
        //RadSKontrolerima.kreirajPcshop();
        HibernateSessionPocetniInsert.odradiPosao();
        //new SplashScreen().setVisible(true);
   }
}
