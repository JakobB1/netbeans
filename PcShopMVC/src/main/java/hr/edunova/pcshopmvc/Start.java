/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc;

import hr.edunova.pcshopmvc.util.HibernateSessionPocetniInsert;
import hr.edunova.pcshopmvc.util.HibernateUtil;
import hr.edunova.pcshopmvc.util.IzlistanjeObjekataIzBaze;
import hr.edunova.pcshopmvc.util.RadSKontrolerima;
import hr.edunova.pcshopmvc.view.SplashScreen;



/**
 *
 * @author jalep
 */
public class Start {
    public static void main(String[] args) {
        HibernateSessionPocetniInsert.odradiPosao();
        //IzlistanjeObjekataIzBaze.radSControllerKlasom();
        //RadSKontrolerima.kreirajPcshop();
        //HibernateUtil.getSession();
        //new SplashScreen().setVisible(true);
    }
}
