/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Djelatnik extends Osoba{
   
    private String brojUgovora;
    private String ziroRacun;

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    public String getZiroRacun() {
        return ziroRacun;
    }

    public void setZiroRacun(String ziroRacun) {
        this.ziroRacun = ziroRacun;
    }
    
}
