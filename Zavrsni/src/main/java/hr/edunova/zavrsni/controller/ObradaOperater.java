/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.controller;

import hr.edunova.zavrsni.model.Operater;
import hr.edunova.zavrsni.model.Racun;
import hr.edunova.zavrsni.util.EdunovaException;
import java.math.BigDecimal;
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
        kontrolaEmail();
        kontrolaOIB();
        kontrolaBrojUgovora(); 
        kontrolaCertifikat();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        if(entitet.getRacuni().size()>0){
            String o = "";
            for(Racun r: entitet.getRacuni()){
                o+=r.getBrojRacuna() + ", ";
            }
            o=o.substring(0,o.length()-2);
            throw new EdunovaException("Ne mozete obrisati operatera jer su na njemu racuni: "
            +o);
    }
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

    
    
    
    
    private void kontrolaEmail() throws EdunovaException{
        if(!(entitet.getEmail().contains("@"))){
           throw new EdunovaException ("Email nije ispravan");
       }
        
        Query q = session.createNativeQuery("select count(*) from operater where email=:emailParametar");
        q.setParameter("emailParametar", entitet.getEmail());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Email je vec postojec");
        }
    }

    
    
    
    
    private void kontrolaOIB() throws EdunovaException{
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

    
    
    
    
    private void kontrolaBrojUgovora() throws EdunovaException{
        if(entitet.getBrojUgovora()==null || !entitet.getBrojUgovora().contains("/")){
               throw new EdunovaException("Broj ugovora mora imati znak /");
           }
        
        Query q = session.createNativeQuery("select count(*) from operater where brojUgovora=:brojUgovoraParametar");
        q.setParameter("brojUgovoraParametar", entitet.getBrojUgovora());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Broj ugovora vec postoji");
        }
    }
    
    
    
    
    
    private void kontrolaCertifikat() throws EdunovaException{
        if(entitet.getCertifikat()==null){
          throw new EdunovaException("Indikacija certificiranosti operatera obavezna");
      }  
    }
}
