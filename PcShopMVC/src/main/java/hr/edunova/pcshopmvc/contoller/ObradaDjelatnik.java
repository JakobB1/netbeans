/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.contoller;

import hr.edunova.pcshopmvc.model.Djelatnik;
import hr.edunova.pcshopmvc.util.EdunovaException;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaDjelatnik extends Obrada<Djelatnik>{

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOIB();
    }

    private void kontrolaOIB() throws EdunovaException {
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

    @Override
    public List<Djelatnik> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
