/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Djelatnik;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;
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
        kontrolaIme();
        kontrolaPrezime();
        kontrolaBrojUgovora();
        kontrolaEmail();
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
        
        Query q = session.createNativeQuery("select count(*) from djelatnik where brojugovora=:brojugovoraParametar");
        q.setParameter("brojugovoraParametar", entitet.getBrojUgovora());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Broj ugovora je vec postojeci");
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

    
    
    
    
    private void kontrolaIme() throws EdunovaException{
        if(entitet.getIme()==null || entitet.getIme().trim().length()==0){
           throw new EdunovaException("Ime obavezno");
       }
        
        if(entitet.getIme().length()>50){
            throw new EdunovaException("Ime ne moze biti duze od 50 znakova");
        }
    }

    
    
    
    private void kontrolaPrezime() throws EdunovaException{
        if(entitet.getPrezime()==null || entitet.getPrezime().trim().length()==0){
           throw new EdunovaException("Prezime obavezno");
       }
        
        if(entitet.getPrezime().length()>50){
            throw new EdunovaException("Prezime ne moze biti duze od 50 znakova");
        }
    }

    
    
    
    private void kontrolaEmail() throws EdunovaException{
        if(!(entitet.getEmail().contains("@"))){
           throw new EdunovaException ("Email neispravan");
       }
        
        Query q = session.createNativeQuery("select count(*) from djelatnik where email=:emailParametar");
        q.setParameter("emailParametar", entitet.getEmail());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Email i osoba su vec postojeci");
        }
    }
    
}
    
