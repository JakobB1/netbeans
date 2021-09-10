/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.contoller;

import edunova.jp24.model.Polaznik;
import edunova.jp24.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaPolaznik extends Obrada<Polaznik>{

    @Override
    public List<Polaznik> read() {
        return session.createQuery("from Polaznik").list();
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
