/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.util;

import hr.edunova.pcshopmvc.contoller.ObradaPcshop;
import hr.edunova.pcshopmvc.model.Pcshop;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalep
 */
public class ConsoleUnosPcshop {
    
    
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        ObradaPcshop os = new ObradaPcshop();
        Pcshop p = new Pcshop();
        os.setEntitet(p);
        while(true){
            System.out.println("Unesi naziv pcshopa: ");
            p.setNaziv(ulaz.nextLine());
            try {
                os.create();
                break;
            } catch (EdunovaException ex) {
                System.out.println(ex.getPoruka());
            }
        }
    }
    
}
