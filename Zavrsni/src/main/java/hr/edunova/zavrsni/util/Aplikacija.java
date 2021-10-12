/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.util;

import hr.edunova.zavrsni.model.Login;

/**
 *
 * @author jalep
 */
public class Aplikacija {
    
    public static final String NASLOV_APP="Edunova PC APP";
    
    public static Login login;
    
    
    public static String getNaslov() {
        if(Aplikacija.login==null){
            return Aplikacija.NASLOV_APP;
        }
        return Aplikacija.NASLOV_APP + " Izbornik: " + Aplikacija.login.getImePrezime();
        }
    }