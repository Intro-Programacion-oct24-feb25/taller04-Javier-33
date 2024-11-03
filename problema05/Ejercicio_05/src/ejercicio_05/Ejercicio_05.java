/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_05;
import java.util.Scanner; 

/**
 *
 * @author javiv
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valor_total;
        Double netflix;
        Double netflix_d;
        Double youtube;
        Double youtube_d;
        Double dropbox;
        Double dropbox_d;
        Double spotify;
        System.out.println("Ingrese el valor a pagar de Netflix: ");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Youtube: ");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Dropbox: ");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Spotify: ");
        spotify = entrada.nextDouble();
        netflix_d = netflix - (netflix * 0.23);
        youtube_d = youtube - (youtube * 0.23);
        dropbox_d = dropbox - (dropbox * 0.45);
        valor_total = netflix_d + youtube_d + dropbox_d + spotify;
        System.out.println("Netflix y Youtube tienen un descuento del 23%, "
                + "mientras que Dropbox de un 45%, el valor total a pagar es: "
        +valor_total);
        


        
        
        // TODO code application logic here
    }
    
}
