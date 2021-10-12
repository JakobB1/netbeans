/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni;

import hr.edunova.zavrsni.util.HibernateSessionPocetniInsert;
import hr.edunova.zavrsni.util.HibernateUtil;
import hr.edunova.zavrsni.view.SplashScreen;

/**
 *
 * @author jalep
 */
public class Start {
    
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        //HibernateSessionPocetniInsert.odradiPosao();
        new SplashScreen().setVisible(true);
    }
    
}
