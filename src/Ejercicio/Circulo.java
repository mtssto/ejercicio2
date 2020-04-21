
package Ejercicio;

import javax.swing.JOptionPane;


public class Circulo extends Area
{
     private double radio;
     private double areacirculo;
     static final double pi = 3.14;//pongo el modificador private para que no puedan modificarse los valores una vez que se ingresan 

    public Circulo(double radio) {
        this.radio = radio;
        
    }

     
   

     
     @Override
 public void Area()
    {
    areacirculo= radio * pi;
        JOptionPane.showMessageDialog(null, "El area del circulo es : " + areacirculo);
    }
  
}
