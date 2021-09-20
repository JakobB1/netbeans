/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.contoller;

import hr.edunova.pcshopmvc.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public abstract class Obrada<T> {
    
    protected Session session;
    protected T entitet;
    
    public abstract List<T> read();
    protected abstract void kontrolaCreate();
    protected abstract void kontrolaUpdate();
    protected abstract void kontrolaDelete();
    
    public Obrada(){
        this.session = HibernateUtil.getSession();
        
    }
    
    public T create(){
        kontrolaCreate();
        save();
        return entitet;
    }
    public T update(){
        kontrolaUpdate();
        save();
        return entitet;
    }
    
    public void delete(){
        kontrolaDelete();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
    private void save(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
}