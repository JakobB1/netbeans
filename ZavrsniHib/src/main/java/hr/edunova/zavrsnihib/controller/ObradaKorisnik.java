/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Korisnik;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaKorisnik extends Obrada<Korisnik>{

    @Override
    public List<Korisnik> read() {
        return session.createQuery("from Korisnik").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }
    
}
