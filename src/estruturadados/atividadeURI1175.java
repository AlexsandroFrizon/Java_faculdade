/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

/**
 *
 * @author alexs
 */
import java.io.IOException;
import java.util.Scanner;

public class atividadeURI1175 {

   public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int aux;
        int[] N = new int[20];
        for (int i=0; i < N.length; i++) {
            N[i] = leitor.nextInt();
        }
        for (int i=0; i < (N.length / 2); i++) {
        	aux = N[i];
        	N[i] = N[N.length - 1- i];
        	N[N.length - 1 -i] = aux;
        }
        for (int i=0; i < N.length; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }

}
