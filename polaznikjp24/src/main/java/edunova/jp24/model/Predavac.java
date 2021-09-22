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
    
    private String iban;
    public String getBrojUgovora;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getGetBrojUgovora() {
        return getBrojUgovora;
    }

    public void setGetBrojUgovora(String getBrojUgovora) {
        this.getBrojUgovora = getBrojUgovora;
    }
    
    
}
