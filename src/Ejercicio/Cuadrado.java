
package Ejercicio;


public class Cuadrado extends Area
{
    private double lado;
    private double areaCuadrado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
   
       @Override
     public void Area()
    {
        areaCuadrado = lado * lado;
        System.out.println("El area del cuadrado es : " + areaCuadrado);
    }
}
