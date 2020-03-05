/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Kike
 */
public class Objetos {
    
    Clases.Especie e1 = new Clases.Especie();
    Tipos.Delfin d1 = new Tipos.Delfin();
    Tipos.Raptor r1 = new Tipos.Raptor();
    
    public void ej(){
        d1.respirar();
        r1.respirar();
        e1.respirar();
        
    }
}
