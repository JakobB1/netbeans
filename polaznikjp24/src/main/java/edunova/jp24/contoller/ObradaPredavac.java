/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.contoller;


import edunova.jp24.model.Predavac;
import edunova.jp24.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaPredavac extends Obrada<Predavac>{

    @Override
    public List<Predavac> read() {
        return session.createQuery("from Predavac").list();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }
    
}