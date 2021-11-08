/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.controller;

import hr.edunova.zavrsni.model.Korisnik;
import hr.edunova.zavrsni.util.EdunovaException;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;

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
        kontrolaIme();
        kontrolaPrezime();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaIme() throws EdunovaException{
        if(entitet.getIme()==null || entitet.getIme().trim().length()==0){
            throw new EdunovaException("Ime obavezno");
        }
        
        if(entitet.getIme().length()>50){
            throw new EdunovaException("Ime ne moze biti duze od 50 znakova");    
        }
        
        Query q = session.createNativeQuery("select count(*) from korisnik where ime=:imeParametar");
        q.setParameter("imeParametar", entitet.getIme());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Ime već postoji");
        }
        
    }

    private void kontrolaPrezime() throws EdunovaException{
        if(entitet.getPrezime()==null || entitet.getPrezime().trim().length()==0){
            throw new EdunovaException("Prezime obavezno");
        }
        
        if(entitet.getPrezime().length()>50){
            throw new EdunovaException("Prezime ne moze biti duze od 50 znakova");    
        }
        
        Query q = session.createNativeQuery("select count(*) from korisnik where prezime=:prezimeParametar");
        q.setParameter("prezimeParametar", entitet.getPrezime());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Prezime već postoji");
        }
        
    }
    
}
