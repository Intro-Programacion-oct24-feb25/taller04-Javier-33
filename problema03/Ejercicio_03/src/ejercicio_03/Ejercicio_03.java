/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;

import java.util.Scanner; 
/**
 *
 * @author javiv
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double planilla;
        Double costo_minuto;
        Double minuto_mes;
        String direccion;
        String nombre_completo;
        System.out.println("Ingrese el costo por minuto: ");
        costo_minuto = entrada.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos"
                + " en el mes: ");
        minuto_mes = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese la direccion del usuario: ");
        direccion = entrada.nextLine();
        System.out.println("Ingrese el nombre completo del usuario: ");
        nombre_completo = entrada.nextLine();
        planilla = (costo_minuto * minuto_mes);
        
        System.out.printf("Reporte:\nNombres Completos: %s\n\tDireccion: %s\n"
                +"Costo por minuto: $ %.2f\n\tNumero de minutos consumidos: "
                + "%.2f\n\t\tValor a cancelar: $ %.2f\n",
                nombre_completo,
                direccion,
                costo_minuto,
                minuto_mes,
                planilla);

          
        // TODO code application logic here
    }
    
}
