/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.controller;

import edunova.jp24.model.Smjer;
import edunova.jp24.util.EdunovaException;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author jalep
 */
public class ObradaSmjer extends Obrada<Smjer>{

    @Override
    public List<Smjer> read() {
           return session.createQuery("from Smjer").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaNaziv();
        kontrolaCertifikat();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
         kontrolaNaziv();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
   
    }

    private void kontrolaNaziv() throws EdunovaException {
       
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().length()==0){
           throw new EdunovaException("Naziv obavezno");
       }
        
        if(entitet.getNaziv().length()>50){
            throw new EdunovaException("Naziv ne moze biti duzi od 50 znakova");
        }
        
        /*
        List<Smjer> sviSmjerovi = read();
        for(Smjer s: sviSmjerovi){
            if(s.getNaziv().equals(entitet.getNaziv())){
                throw new EdunovaException("Naziv već postoji");
            }
        }
        */
        
        
        Query q = session.createNativeQuery("select count(*) from smjer where naziv=:nazivParametar");
        q.setParameter("nazivParametar", entitet.getNaziv());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Naziv vec postoji");
        }
        
    }

    private void kontrolaCertifikat() throws EdunovaException{
      if(entitet.getCertifikat()==null){
          throw new EdunovaException("Indikacija certificiranosti smjera obavezna");
      }  
    }
    
}
