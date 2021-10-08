/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Operater;
import hr.edunova.zavrsnihib.util.EdunovaException;
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
        try {
            oper = (Operater)session.createQuery("from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
         
        
        if(oper==null){
            return null;
        }
        
        return BCrypt.checkpw(lozinka, oper.getLozinka()) ? oper : null;
    }
    

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOIB();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    private void kontrolaOIB() throws EdunovaException  {
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
    
    

}
