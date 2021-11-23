/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnieng.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author jalep
 */
@MappedSuperclass
public abstract class Person extends Entitet{
    
    private String name;
    private String surname;
    
    @Column(columnDefinition = "char(11)")
    private String oib;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
}