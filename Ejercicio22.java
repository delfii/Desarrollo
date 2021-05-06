/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfiita;

/**
 *
 * @author pc01
 */
import java.util.Scanner;
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
                char caracter;
        System.out.println("ingrese un caracter y dire si es vocal");
        caracter= entrada.next().charAt(0);
        switch(caracter)
        {case 'a':System.out.println("el caracter es una vocal");
        break;
        case 'e': System.out.println("el caracter es una vocal");
        break;
        case 'i': System.out.println("el caracter es una vocal");
        case 'o': System.out.println("el caracter es una vocal");
        break;
        case 'u': System.out.println("el caracter es una vocal");
        break;
        default: System.out.println("el caracter no es una vocal");
        break;
        }
    }
    
}
