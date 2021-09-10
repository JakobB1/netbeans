/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.contoller;

import edunova.jp24.model.Smjer;
import java.util.List;

/**
 *
 * @author jalep
 */
public class ObradaSmjer extends Obrada<Smjer>{

    @Override
    public List<Smjer> read() {
        return session.createQuery("from Smjer").list();
    }
    
}
