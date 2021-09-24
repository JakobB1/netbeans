/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.controller;

import edunova.jp24.model.Polaznik;
import edunova.jp24.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik>{

    @Override
    public List<Polaznik> read() {
        return session.createQuery("from Polaznik").list();
    }
    
    public List<Polaznik> read(String uvjet){
        return session.createQuery("from Polaznik p"
                + " where concat(p.ime,' ', p.prezime,' ', p.ime,' ', p.oib) "
                + " like :uvjet order by p.prezime, p.ime")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }
    

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        super.kontrolaCreate();
        kontrolaBrojUgovora();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
    
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
   
    }

    private void kontrolaBrojUgovora()throws EdunovaException {
        
           if(entitet.getBrojUgovora()==null || !entitet.getBrojUgovora().contains("/")){
               throw new EdunovaException("Broj ugovora mora imati znak /");
           }
        
    }
    
}
