/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Racun;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaRacun extends Obrada<Racun>{

    @Override
    public List<Racun> read() {
        return session.createQuery("from Racun").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaProizvod();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaProizvod() throws EdunovaException{
        
    }
}