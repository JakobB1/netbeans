/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.controller;

import edunova.jp24.model.Osoba;
import edunova.jp24.util.EdunovaException;

/**
 *
 * @author jalep
 */
public abstract class ObradaOsoba <T extends Osoba> extends Obrada<T>{

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOIB();
    }

    private void kontrolaOIB() throws EdunovaException{
        if(!oibValjan(entitet.getOib()))
            throw new EdunovaException("OIB nije ispravan");
    }

    private boolean oibValjan(String oib) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
