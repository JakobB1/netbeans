/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.util;

import hr.edunova.zavrsnihib.model.Login;

/**
 *
 * @author jalep
 */
public class Aplikacija {
    
    public static final String NASLOV_APP = "Edunova APP";
    
    public static Login login;
    
    public static String getNaslov(String naziv){
        if(Aplikacija.login==null){
            return Aplikacija.NASLOV_APP;
        }
        return Aplikacija.NASLOV_APP + " " + naziv + ": " + Aplikacija.login.getImePrezime();
    }
    
}
