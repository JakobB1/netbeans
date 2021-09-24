/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.controller;

import edunova.jp24.model.Predavac;
import edunova.jp24.util.EdunovaException;
import java.util.List;
import org.apache.commons.validator.routines.IBANValidator;

/**
 *
 * @author jalep
 */
public class ObradaPredavac extends ObradaOsoba<Predavac>{

    @Override
    public List<Predavac> read() {
        return session.createQuery("from Predavac").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate(); // s time odradiš sve kontrole create vezane za osobu
        kontrolaIban();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
    
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
    
    }

    private void kontrolaIban() throws EdunovaException {
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
