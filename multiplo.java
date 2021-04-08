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
public class multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner ( System.in);
        int numero;
        System.out.println("ingrese un numero");
        numero= entrada.nextInt();
        if (numero%10==0)
            System.out.println("es multiplo de 10");
        else
            System.out.println("no es multiplo de 10");
    }
    
}
