/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.util;

import hr.edunova.zavrsnihib.controller.ObradaPcshop;
import hr.edunova.zavrsnihib.model.Pcshop;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalep
 */
public class RadSKontrolerima {
    
    public static void kreirajPcshop(){
        ObradaPcshop op = new ObradaPcshop();
        Pcshop p = new Pcshop();
        op.setEntitet(p);
        
        try {
            op.create();
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
        
    }
    
}
