/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Racun;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;

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
        kontrolaBrojRacuna();
        kontrolaKorisnik();
        kontrolaOperater();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    

    private void kontrolaBrojRacuna() throws EdunovaException{
         if(entitet.getBrojRacuna()==null || entitet.getBrojRacuna().trim().length()==0){
           throw new EdunovaException("Broj racuna obavezno");
       }
        
        if(entitet.getBrojRacuna().length()>50){
            throw new EdunovaException("Broj racuna ne moze biti duzi od 50 znakova");
        }
        
        Query q = session.createNativeQuery("select count(*) from racun where brojRacuna=:brojRacunaParametar");
        q.setParameter("brojRacunaParametar", entitet.getBrojRacuna());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Broj racuna već postoji");
        }
    }

    private void kontrolaOperater() throws EdunovaException{
        if(entitet.getOperater()==null || entitet.getOperater().getId().equals(Long.valueOf(0))){
            throw new EdunovaException("Operater obavezno");
        }
    }
    
    private void kontrolaKorisnik() throws EdunovaException{
        if(entitet.getKorisnik()==null || entitet.getKorisnik().getId().equals(Long.valueOf(0))){
            entitet.setKorisnik(null);
        }
    }
    
}