/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import edunova.jp24.controller.ObradaSmjer;
import edunova.jp24.model.Smjer;

/**
 *
 * @author jalep
 */
public class RadSKontrolerima {
    
    public static void kreirajSmjer(){
        ObradaSmjer os = new ObradaSmjer();
        Smjer s = new Smjer();
        s.setNaziv("Novi smjer 23");
        s.setCertifikat(true);
        os.setEntitet(s);
        
        
        try {
            os.create();
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
        
        
    }
    
}