/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.controller;

import edunova.jp24.model.Grupa;
import edunova.jp24.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaGrupa extends Obrada<Grupa>{

    @Override
    public List<Grupa> read() {
        return session.createQuery("from Grupa").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaSmjer();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaSmjer() throws EdunovaException{
        if(entitet.getSmjer()==null || entitet.getSmjer().getId().equals(Long.valueOf(0))){
            throw new EdunovaException("Smjer obavezno");
        }
        
    }
}