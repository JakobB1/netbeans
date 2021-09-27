/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.controller;

import hr.edunova.zavrsnihib.model.Pcshop;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaPcshop extends Obrada<Pcshop>{

    @Override
    public List<Pcshop> read() {
        return session.createQuery("from Pcshop").list();
    }

    @Override
    protected void kontrolaCreate() {
        
    }

    @Override
    protected void kontrolaUpdate() {
        
    }

    @Override
    protected void kontrolaDelete() {
        
    }
    
}