/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.controller;

import hr.edunova.zavrsni.model.Korisnik;
import hr.edunova.zavrsni.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaKorisnik extends ObradaOsoba<Korisnik>{

    @Override
    public List<Korisnik> read() {
        return session.createQuery("from Korisnik").list();
    }

    public List<Korisnik> read(String uvjet){
        return session.createQuery("from Korisnik k"
                + " where concat(k.ime,' ', k.prezime,' ', k.ime,' ', k.oib) "
                + " like :uvjet order by k.prezime, k.ime")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }
    
    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }
    
}
