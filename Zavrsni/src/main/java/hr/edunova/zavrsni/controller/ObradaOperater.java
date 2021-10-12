/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.controller;

import hr.edunova.zavrsni.model.Operater;
import hr.edunova.zavrsni.util.EdunovaException;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author jalep
 */
public class ObradaOperater extends Obrada<Operater>{

    @Override
    public List<Operater> read() {
        return session.createQuery("from Operater").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaNaziv();
        kontrolaCertifikat();
        kontrolaBrojUgovora();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaNaziv() throws EdunovaException{
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().length()==0){
            throw new EdunovaException("Naziv obavezno");
        }
        
        if(entitet.getNaziv().length()>50){
            throw new EdunovaException("Naziv ne moze biti duzi od 50 znakova");    
        }
        
        Query q = session.createNativeQuery("select count(*) from operater where naziv=:nazivParametar");
        q.setParameter("nazivParametar", entitet.getNaziv());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Naziv vec postoji");
        }
        
    }

    private void kontrolaCertifikat() throws EdunovaException{
        if(entitet.getCertifikat()==null){
            throw new EdunovaException("Indikacije certificiranosti smjera obavezna");
        }
    }

    private void kontrolaBrojUgovora() throws EdunovaException{
        if(entitet.getBrojugovora()==null || entitet.getBrojugovora().contains("/")){
            throw new EdunovaException("Broj ugovora mora imati znak /");
        }
    }
    
}
