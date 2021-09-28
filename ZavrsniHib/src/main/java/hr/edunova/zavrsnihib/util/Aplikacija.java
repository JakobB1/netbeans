/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.util;

import hr.edunova.zavrsnihib.model.Operater;

/**
 *
 * @author jalep
 */
public class Aplikacija {
    
    public static final String NASLOV_APP = "Edunova APP Pcshop";
    
    public static Operater operater;
    
    public static String getNaslov(){
        if(Aplikacija.operater==null){
            return Aplikacija.NASLOV_APP;
        }
        return Aplikacija.NASLOV_APP + " Izbornik: " + Aplikacija.operater.getImePrezime();
    }
    
}
