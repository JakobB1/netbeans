/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.vjezbanjemapiranje.nasljedivanje;

import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Automobil extends Vozilo{
      private int brojVrata;

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }
      
      
}
