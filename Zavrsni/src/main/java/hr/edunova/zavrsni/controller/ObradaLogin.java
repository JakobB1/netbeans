/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.controller;

import hr.edunova.zavrsni.model.Login;
import hr.edunova.zavrsni.util.EdunovaException;
import java.util.List;
import javax.persistence.NoResultException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jalep
 */
public class ObradaLogin extends ObradaOsoba<Login>{

    @Override
    public List<Login> read() {
        return session.createQuery("from Login").list();
    }

    public Login autoriziraj(String email, String lozinka){
        
        Login log=null;
        try {
            log = (Login)session.createQuery("from Login l where l.email=:email")
                .setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
       
        
        if(log==null){
            return null;
        }
        
        
        return BCrypt.checkpw(lozinka, log.getLozinka()) ? log : null;
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
