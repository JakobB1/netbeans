/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24;

import edunova.jp24.util.HibernateSessionPocetniInsert;
import edunova.jp24.view.SplashScreen;



/**
 *
 * @author jalep
 */
public class Start {
    
    public static void main(String[] args) {
        //HibernateSessionPocetniInsert.odradiPosao();
        new SplashScreen().setVisible(true);
        
    }
}
