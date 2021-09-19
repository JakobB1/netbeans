/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.controller;

import edunova.jp24.model.Operater;
import edunova.jp24.util.EdunovaException;
import java.util.List;
import javax.persistence.NoResultException;
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
        Operater oper=null;
        try{
            oper = (Operater)session.createQuery("from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        }catch(NoResultException e){
            return null;
        }
     
        
        if(oper==null){
            return null;
        }
        
        return BCrypt.checkpw(lozinka, oper.getLozinka()) ? oper : null;
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
    
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
  
    }

   
    
}