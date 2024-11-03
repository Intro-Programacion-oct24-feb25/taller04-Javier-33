/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01;

import java.util.Scanner;
/**
 *
 * @author javiv
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double area;
        Double base;
        Double altura;
         
        System.out.println("Ingrese la base del triangulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triagunlo: ");
        altura = entrada.nextDouble();
        area = (base*altura)/2;
        System.out.println("El area del triangulo es: "+area);
        
        
        
        
        // TODO code application logic here
    }
    
}
