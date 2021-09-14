/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.vjezbanjemapiranje.vezavisenapremajedan;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jalep
 */
@Entity
public class Grad {
    
    @Id
    private Long id;
    
    private String naziv;
    
    
    
}
