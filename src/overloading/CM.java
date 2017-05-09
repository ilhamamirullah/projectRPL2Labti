/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author IlhamAmirullah
 */
public class CM {
    public static void main (String [] args){
        Nama a = new Nama();
        Gol_dar b = new Gol_dar(); 
        umur c = new umur(); 
        Bbd d = new Bbd(); 
        a.cetak("Ilham"); 
        b.cetak("A"); 
        c.cetak(22); 
        d.cetak(1.7, 55); 
    }
}
