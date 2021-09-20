/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.contoller;

import hr.edunova.pcshopmvc.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author jalep
 */
public abstract class Obrada<T> {
    
    protected Session session;
    protected T entitet;
    
    public Obrada(){
        this.session = HibernateUtil.getSession();
        
    }
    
    public T create(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        return entitet;
    }
}
