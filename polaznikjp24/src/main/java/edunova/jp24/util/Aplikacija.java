/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import edunova.jp24.model.Operater;

/**
 *
 * @author jalep
 */
public class Aplikacija {
    
    public static final String NASLOV_APP="Edunova APP";
    
    public static Operater operater;
    
    
    public static String getNaslov(String naziv){
        if(Aplikacija.operater==null){
            return Aplikacija.NASLOV_APP;
        }
        return Aplikacija.NASLOV_APP + " " + naziv +": " + Aplikacija.operater.getImePrezime();
    }
}