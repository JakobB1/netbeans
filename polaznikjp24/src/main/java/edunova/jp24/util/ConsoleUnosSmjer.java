/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.util;

import edunova.jp24.contoller.ObradaSmjer;
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
       Scanner ulaz = new Scanner(System.in);
       ObradaSmjer os = new ObradaSmjer();
       Smjer s = new Smjer();
       
        while (true) {            
            System.out.print("Unesi naziv smjera");
            s.setNaziv(ulaz.nextLine());
           try {
               os.create();
               break;
           } catch (EdunovaException ex) {
               System.out.println(ex.getPoruka());
           }
        }
       
    }
}