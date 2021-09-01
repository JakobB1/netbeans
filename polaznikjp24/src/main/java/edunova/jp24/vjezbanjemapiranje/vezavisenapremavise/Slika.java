/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.vjezbanjemapiranje.vezavisenapremavise;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jalep
 */
@Entity
public class Slika {
    
    @Id
    private Long id;
    
    private String naziv;
    
    private List<Oznaka> oznake;
    
}
