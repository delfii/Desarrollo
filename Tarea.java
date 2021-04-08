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
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        float velocidad;
        float res;
        System.out.println("ingrese una velocidad");
        velocidad= entrada.nextInt();
        res = velocidad / 3.6f;
        System.out.println("la velocidad en m/s es " +res);
        
        
        
    }
    
}
