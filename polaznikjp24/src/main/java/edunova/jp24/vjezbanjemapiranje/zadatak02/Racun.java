/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.vjezbanjemapiranje.zadatak02;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jalep
 */
@Entity
public class Racun {
    
    @Id
    private int brojRacuna;

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }
     
}
