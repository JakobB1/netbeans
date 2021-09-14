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
public class Stavka {
    
    private int proizvod;
    private int racun;
    private BigDecimal kolicina;
    
}
