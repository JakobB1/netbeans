/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Proizvod;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author jalep
 */
public class ObradaProizvod extends Obrada<Proizvod>{

    @Override
    public List<Proizvod> read() {
        return session.createQuery("from Proizvod").list();
    }

    public List<Proizvod> read(String uvjet){
        return session.createQuery("from Proizvod p"
                + " where concat(p.naziv) "
                + " like :uvjet order by p.naziv")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }
    
    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaNaziv();
        kontrolaCijena();
        kontrolaKodArtikla();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    
    

    private void kontrolaNaziv() throws EdunovaException{
        
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().length()==0){
           throw new EdunovaException("Naziv proizvoda obavezno");
       }
    }
    
    
    
    
    private void kontrolaCijena() throws EdunovaException{
        if(entitet.getCijena()==null || entitet.getCijena().compareTo(BigDecimal.ZERO)<=0){
          throw new EdunovaException("Cijena obavezno veca od nule");
      }  
    }

    
    
    
    private void kontrolaKodArtikla() throws EdunovaException{
        if(entitet.getKodArtikla()==null || entitet.getKodArtikla().trim().length()==0){
           throw new EdunovaException("Kod artikla obavezan");
    }
        Query q = session.createNativeQuery("select count(*) from proizvod where kodartikla=:kodartiklaParametar");
        q.setParameter("kodartiklaParametar", entitet.getKodArtikla());
      
        BigInteger ukupno = (BigInteger)q.getSingleResult();
     
        if(ukupno.compareTo(BigInteger.ZERO)>0){
             throw new EdunovaException("Kod vec postoji");
        }
}
}