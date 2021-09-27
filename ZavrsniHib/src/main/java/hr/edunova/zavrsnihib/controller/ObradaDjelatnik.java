/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Djelatnik;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.util.List;
import org.apache.commons.validator.routines.IBANValidator;

/**
 *
 * @author jalep
 */
public class ObradaDjelatnik extends ObradaOsoba<Djelatnik>{

    @Override
    public List<Djelatnik> read() {
        return session.createQuery("from Djelatnik").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        kontrolaBrojUgovora();
        kontrolaIban();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaBrojUgovora() throws EdunovaException{
        if(entitet.getBrojUgovora()==null || !entitet.getBrojUgovora().contains("/")){
               throw new EdunovaException("Broj ugovora mora imati znak /");
           }
    }

    private void kontrolaIban() throws EdunovaException{
        
        /*
        // NE RADI, popraviti
        IBANValidator ibanValidator = new IBANValidator();
        ibanValidator.setValidator("HR", 21, "HR");
        if(!ibanValidator.isValid(entitet.getIban())){
            throw new EdunovaException("IBAN nije valjan");
        }
        */
    }
    
}
    
