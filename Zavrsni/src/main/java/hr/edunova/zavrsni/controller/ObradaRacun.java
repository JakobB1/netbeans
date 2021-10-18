/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.controller;

import hr.edunova.zavrsni.model.Racun;
import hr.edunova.zavrsni.util.EdunovaException;
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
        kontrolaOperater();
        kontrolaKorisnik();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaOperater() throws EdunovaException{
        if(entitet.getOperater()==null || entitet.getOperater().getId().equals(Long.valueOf(0))){
            throw new EdunovaException("Operater obavezan");
        }
    }

    private void kontrolaKorisnik() throws EdunovaException{
        if(entitet.getKorisnik()==null || entitet.getKorisnik().getId().equals(Long.valueOf(0))){
            throw new EdunovaException("Korisnik obavezan");
    }
   }
}
