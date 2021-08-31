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
import java.io.*;
import java.util.*;

public class atividadeURI1110 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        String[] respostas = new String[50];
        for (int i = 0; i < 50; i++) {
            StringBuilder sb = new StringBuilder();
           
            int qteCartas = i+1;
           
            ArrayList<Integer> pilha = new ArrayList<Integer>();

            insere(qteCartas, pilha);

            sb.append("Discartar carta: ");
           
            int topo = 0;
            while (qteCartas > 1) {
                if (topo > 0) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(pilha.get(topo)));
                topo++; // simula uma remoção da pilha
                qteCartas--; // por remover uma carta
                realoca(topo, pilha); // coloca a carta no topo na base
                topo++; // considera a proxima carta
            }
           
            sb.append("\nResta essas cartas: " + pilha.get(topo) + "\n");
           
            respostas[i] = sb.toString();
           
        }

        int qteCartas = leitor(br);
       
        while (qteCartas != 0) {
            bw.write(respostas[qteCartas-1]);
           
            qteCartas = leitor(br);
        }

        bw.flush();       
        bw.close();
    }

    static void insere(int qte, ArrayList<Integer> pilha) {
        for (int i = 0; i < qte; i++) {
            pilha.add(i+1);
        }
    }
   
    static void realoca(int topo, ArrayList<Integer> pilha) {
        int carta = pilha.get(topo);      
        pilha.add(carta);
    }
       
    static int leitor(BufferedReader br) throws NumberFormatException, IOException {
       int n;
       int resp = 0;
       int sinal = 1;
       while (true) {
           n = br.read();
           if (n >= '0' && n <= '9') break;
           if (n == '-') sinal = -1;
           if (n == '+') sinal = 1;
       }
       while (true) {
           resp = resp*10 + n-'0';
           n = br.read();
           if (n < '0' || n > '9') break;
       }

       return resp*sinal;
    }
}
