/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.controller;

import hr.edunova.zavrsni.model.Proizvod;
import hr.edunova.zavrsni.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaProizvod extends Obrada<Proizvod>{

    @Override
    public List<Proizvod> read() {
        return session.createQuery("from Proizvod").list();
    }
    
    public List<Proizvod> read(String uvjet){
        return session.createQuery("from Proizvod p"
                + " where concat(p.naziv) "
                + " like :uvjet order by p.naziv")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(50)
                .list();
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
