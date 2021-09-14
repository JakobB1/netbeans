/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Stavka extends Entitet{
    
    private int proizvod;
    private int racun;
    private BigDecimal kolicina;

    public int getProizvod() {
        return proizvod;
    }

    public void setProizvod(int proizvod) {
        this.proizvod = proizvod;
    }

    public int getRacun() {
        return racun;
    }

    public void setRacun(int racun) {
        this.racun = racun;
    }

    public BigDecimal getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigDecimal kolicina) {
        this.kolicina = kolicina;
    }
 
    
}
