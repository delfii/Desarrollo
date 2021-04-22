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
public class foringresado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        int num=0;
        System.out.println("ingrese un numero maximo");
        num=entrada.nextInt();
        for (int i=1;i<=num; i++){
            if (i%6==0) {
                System.out.println(i);
            }
        }
        
    }
    
}
