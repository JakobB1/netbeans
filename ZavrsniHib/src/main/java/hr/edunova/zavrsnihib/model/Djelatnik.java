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
    
    @Column(columnDefinition = "char(11)")
    private String oib;
    
    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
    
    
}
