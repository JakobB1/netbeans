/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.vjezbanjemapiranje.vezavisenapramajedan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author jalep
 */
@Entity
public class Igrac {
    
    @Id
    private Long id;
    
    private String ime;
    private String prezime;
    
    @ManyToOne
    private Grad grad;
    
}
