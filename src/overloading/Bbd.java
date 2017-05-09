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
import java.text.DecimalFormat; 

public class Bbd extends Data_diri{ 
    public void cetak (double t, double b){ 
        double i; 
        String k; 
        DecimalFormat df = new DecimalFormat("#.##"); 
        i=b/Math.pow(t,2); 
        if (i<18.5) { 
            k = "underweight"; 
        } else if (i>= 18.5 || i<=24){ k = "normal"; 
        } else if (i>= 25 || i<=29){ k= "overweight"; 
        } else { 
            k= "obesitas"; 
        } 
        System.out.println("Tinggi badan = "+t+" m"); 
        System.out.println("Berat Badan = "+b+" kg"); 
        System.out.println("Berat badan ideal = "+ df.format(i)); 
        System.out.println("Kategori = "+k); 
    } 
}
