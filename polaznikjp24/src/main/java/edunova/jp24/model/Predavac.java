/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.model;

import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Predavac extends Osoba{
    
    private String ziroRacun;

    public String getZiroRacun() {
        return ziroRacun;
    }

    public void setZiroRacun(String ziroRacun) {
        this.ziroRacun = ziroRacun;
    }
    
    
}
