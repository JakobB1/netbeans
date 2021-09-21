/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.contoller;

import hr.edunova.pcshopmvc.model.Pcshop;
import hr.edunova.pcshopmvc.util.EdunovaException;
import java.math.BigDecimal;
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
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException{
        kontrolaNaziv();
        kontrolaCertifikat();
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
        /*
        List<Pcshop> sviPcshopovi = read();
        for(Pcshop p: sviPcshopovi){
            if(p.getNaziv().equals(entitet.getNaziv())){
                throw new EdunovaException("Naziv vec postoji");
            }
        }
        */
        Query q = session.createNativeQuery("select count(*) from pcshop where naziv=:nazivParametar");
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