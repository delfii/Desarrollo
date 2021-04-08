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
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero y se contara hasta ese numero");
         numero= entrada.nextInt();
        for (int i=0; i<=numero; i++)
        System.out.println (i);
    }
    
}
