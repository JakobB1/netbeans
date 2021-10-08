/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Pcshop;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author jalep
 */
public class ObradaPcshop extends Obrada<Pcshop>{

    @Override
    public List<Pcshop> read() {
        return session.createQuery("from Pcshop").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException{
        kontrolaNaziv();
        kontrolaCertifikat();
        kontrolaOib();
        kontrolaVlasnik();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException{
        kontrolaNaziv();
        kontrolaCertifikat();
        kontrolaOib();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException{
        
    }

    
    
    
    private void kontrolaNaziv() throws EdunovaException{
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().length()==0){
           throw new EdunovaException("Naziv obavezno");
       }
        
        if(entitet.getNaziv().length()>50){
            throw new EdunovaException("Naziv ne moze biti duzi od 50 znakova");
        }
        
        Query q = session.createNativeQuery("select count(*) from pcshop where naziv=:nazivParametar");
        q.setParameter("nazivParametar", entitet.getNaziv());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Naziv vec postoji");
        }
        
    }
    
    
    
    
    private void kontrolaVlasnik() throws EdunovaException{
        if(entitet.getVlasnik()==null || entitet.getVlasnik().trim().length()==0){
           throw new EdunovaException("Vlasnik obavezno");
       }
        
        if(entitet.getVlasnik().length()>50){
            throw new EdunovaException("Naziv vlasnika ne moze biti duzi od 50 znakova");
        }
    }
    
    
    
    
    private void kontrolaCertifikat() throws EdunovaException{
      if(entitet.getCertifikat()==null){
          throw new EdunovaException("Indikacija certificiranosti pcshopa obavezna");
      }  
    }

    
    
    
    private void kontrolaOib() throws EdunovaException{
        if(!oibValjan(entitet.getOib())){
            throw new EdunovaException("OIB nije ispravan");
        }
    }
    
    private boolean oibValjan(String oib) {
        if (oib.length() != 11)
            return false;

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        return kontrolni == Integer.parseInt(oib.substring(10));
    }

    
    
}