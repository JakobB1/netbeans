/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Proizvod;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.math.BigDecimal;
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

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaCijena();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaCijena() throws EdunovaException{
        if(entitet.getCijena()==null || entitet.getCijena().compareTo(BigDecimal.ZERO)<=0){
          throw new EdunovaException("Cijena obavezno veca od nule");
      }  
    }
    
    
}