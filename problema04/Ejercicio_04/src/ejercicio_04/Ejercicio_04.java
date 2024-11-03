/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_04;

import java.util.Scanner; 

/**
 *
 * @author javiv
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre_completo;
        Double cpu;
        Double teclado;
        Double raton;
        Double pantalla;
        Double valor_total;
        System.out.println("Ingrese el nombre completo del usuario: ");
        nombre_completo = entrada.nextLine();
        System.out.println("Ingrese el costo del CPU: ");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el costo del teclado: ");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el costo del raton: ");
        raton = entrada.nextDouble();
        System.out.println("Ingrese el costo del pantalla: ");
        pantalla = entrada.nextDouble();
        
        valor_total = (cpu+teclado+raton+pantalla);
        
        System.out.printf("Reporte:\nNombres de clientes: %s\n"
                + "Valores Inicales: \nCpu: %.1f\nTeclado: %.1f\n"
                + "Raton: %.1f\nPantalla: %.1f\n\nValor a Cancelar: %.1f\n",
                nombre_completo,
                cpu,
                teclado,
                raton,
                pantalla,
                valor_total);
        
        // TODO code application logic here
    }
    
}
