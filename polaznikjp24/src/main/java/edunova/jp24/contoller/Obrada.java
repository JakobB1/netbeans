/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.contoller;

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

    public Obrada() {
        this.session = HibernateUtil.getSession();
    }
    
    public T create() {
        save();
        return entitet;
    }
    public T update() {
        save();
        return entitet;
    }
    
    public void delete() {
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    
    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
}
