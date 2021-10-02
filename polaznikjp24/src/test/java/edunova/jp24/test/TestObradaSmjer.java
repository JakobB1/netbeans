/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.test;

import edunova.jp24.controller.ObradaSmjer;
import edunova.jp24.model.Smjer;
import edunova.jp24.util.EdunovaException;
import java.math.BigDecimal;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author jalep
 */
public class TestObradaSmjer {
    
    private ObradaSmjer obrada;
    
    public TestObradaSmjer(){
    obrada = new ObradaSmjer();
    pripremiPodatke();
    }

    private void pripremiPodatke() {
        Smjer s = new Smjer();
        s.setNaziv("Java programiranje");
        s.setCijena(new BigDecimal(5000));
        s.setTrajanje(130);
        s.setCertifikat(Boolean.TRUE);
        obrada.setEntitet(s);
    }
    
    
    @Test
    public void kreiraj(){
        try {
            Smjer s = obrada.create();
            assertFalse("Objekt nije pohranjen u bazu", s.getId().equals(Long.valueOf(0)));
        } catch (EdunovaException e) {
            assertFalse(e.getPoruka(), true);
        } catch(Exception e){
            assertFalse(e.getMessage(), true);
        }
}
    

}
