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

public class atividadeURI1172 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int[] X = new int[10];
        for (int i = 0; i < X.length; i++) {
            X[i] = ler.nextInt();
        }
        for (int i = 0; i < X.length; i++) {
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }
        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}
