/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfiita;
import java.util.Scanner;
/**
 *
 * @author pc01
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        String nombre;
        double evaluacion1; 
        double evaluacion2;
        double evaluacionfinal;
        System.out.println("nombre del alumno");
        nombre= entrada.nextLine();
        System.out.println("nota evaluacion 1");
        evaluacion1=entrada.nextDouble();
        System.out.println("nota evaluacion 2");
        evaluacion2= entrada. nextDouble();
        evaluacionfinal= (evaluacion1 + evaluacion2);
        System.out.println("nota final "+evaluacionfinal);

        
        
        
   
    }
    
}
