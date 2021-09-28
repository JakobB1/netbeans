/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import edunova.jp24.controller.ObradaSmjer;
import edunova.jp24.model.Smjer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalep
 */
public class ConsoleUnosSmjer {
    
    
    public static void main(String[] args) {

        Smjer s = new Smjer();
        s.setNaziv("Edunova");
        
        Smjer t = new Smjer();
        t.setNaziv("Edunova");
        
        // ukoliko su u klasi pregažene metode equals i hashCode tada će biti true
        // inače će biti false
        System.out.println(s.equals(t));
/*
        Scanner ulaz = new Scanner(System.in);
        ObradaSmjer os = new ObradaSmjer();
        Smjer s = new Smjer();
        os.setEntitet(s);
        while(true){
            System.out.println("Unesi naziv smjera: ");
            s.setNaziv(ulaz.nextLine());
            try {
                os.create();
                break;
            } catch (EdunovaException ex) {
                System.out.println(ex.getPoruka());
            }
        }
*/
    }
    
}