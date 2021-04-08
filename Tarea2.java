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
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        float radio, longitud, area;
        System.out.println("ingrese el radio de la circunferencia");
        radio= entrada.nextInt();
        longitud =(float)(2*3*14*radio);
        area =(float)(3.14*radio*radio);
        System.out.println("la longitud es "+longitud+" y el area es "+area);
    }
    
}
