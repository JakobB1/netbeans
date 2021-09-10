/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.contoller;

import edunova.jp24.model.Smjer;
import edunova.jp24.util.EdunovaException;
import java.util.List;

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
    protected void kontrolaCreate() throws EdunovaException{
        kontrolaNaziv();
        kontrolaCertifikat();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException{
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException{
        
    }

    private void kontrolaNaziv() throws EdunovaException {
        
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().length()==0){
            throw new EdunovaException("Naziv obavezno");
        }
        
        if(entitet.getNaziv().length()>50){
            throw new EdunovaException("Naziv ne moze biti duzi od 50 znakova");
        }
    }

    private void kontrolaCertifikat() throws EdunovaException{
        if(entitet.getCertifikat()==null){
            throw new EdunovaException("Indikacija certificiranosti smjera obavezna");
        }
    }
    
}
