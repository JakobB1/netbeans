/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Operater;
import hr.edunova.zavrsnihib.util.EdunovaException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jalep
 */
public class ObradaOperater extends ObradaOsoba<Operater>{

    @Override
    public List<Operater> read() {
        return session.createQuery("from Operater").list();
    }
    
    public Operater autoriziraj(String email, String lozinka){
        
        Operater oper = (Operater)session.createQuery("from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        
        if(oper==null){
            return null;
        }
        
        return BCrypt.checkpw(lozinka, oper.getLozinka()) ? oper : null;
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
