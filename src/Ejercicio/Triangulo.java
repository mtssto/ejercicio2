
package Ejercicio;

import javax.swing.JOptionPane;



public class Triangulo extends Area
{
    private double base;
    private double altura;
    private double areaTriangulo;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
   
     @Override
   public void Area()
    {
    areaTriangulo = base * altura;
        System.out.println("El area del triangulo es " + areaTriangulo);
    }
}
