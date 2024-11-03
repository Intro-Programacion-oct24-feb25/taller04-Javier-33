/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02;

import java.util.Scanner; 
/**
 *
 * @author javiv
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre_hijo1;
        String nombre_hijo2;
        String nombre_hijo3;
        Double gasto_total;
        Double hijo1;
        Double hijo2;
        Double hijo3;
        
        System.out.println("Ingrese el nombre de el primer hijo: ");
        nombre_hijo1 = entrada.nextLine();
        System.out.println("Ingrese los gastos del primer hijo: ");
        hijo1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de el segundo hijo: ");
        nombre_hijo2 = entrada.nextLine();
        System.out.println("Ingrese los gastos del segundo hijo: ");
        hijo2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de el tercer hijo: ");
        nombre_hijo3 = entrada.nextLine();
        System.out.println("Ingrese los gastos del tercer hijo: ");
        hijo3 = entrada.nextDouble();
        entrada.nextLine();
        gasto_total = (hijo1 + hijo2 + hijo3)/3;
        System.out.println("El promedio de gastos de " +nombre_hijo1 + ", " +
                nombre_hijo2+ " y "+nombre_hijo3 + " es :" +gasto_total+"$");

        // TODO code application logic here
    }
    
}
