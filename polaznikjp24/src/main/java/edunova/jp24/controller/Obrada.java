/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.controller;

import edunova.jp24.util.EdunovaException;
import edunova.jp24.util.HibernateUtil;
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
    protected abstract void kontrolaCreate() throws EdunovaException;
    protected abstract void kontrolaUpdate() throws EdunovaException;
    protected abstract void kontrolaDelete() throws EdunovaException;

    public Obrada() {
        this.session = HibernateUtil.getSession();
        //this.session.setCacheMode(CacheMode.REFRESH);
    }
    
    public T create() throws EdunovaException{
        kontrolaCreate();
        save();
        return entitet;
    }
    public T update() throws EdunovaException{
        kontrolaUpdate();
        save();
        return entitet;
    }
    
    public void delete() throws EdunovaException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    
    protected void save(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
}