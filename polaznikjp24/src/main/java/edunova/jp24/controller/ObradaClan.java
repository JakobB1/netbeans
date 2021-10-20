/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.controller;

import edunova.jp24.model.Clan;
import edunova.jp24.util.EdunovaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaClan extends Obrada<Clan>{

    @Override
    public List<Clan> read() {
       return new ArrayList<>();
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
