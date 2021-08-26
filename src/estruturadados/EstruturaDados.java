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
public class EstruturaDados {

    public static void main(String[] args) {
        //Vetor com capacidade de 5  
        Vetor vetor = new Vetor(5);
        Vetor vetor2 = new Vetor(10);
        Vetor vetor3 = new Vetor(3);
        vetor.adiciona("elemento 01"); //posição 0
        vetor.adiciona("elemento 02"); //posição 1
        vetor.adiciona("elemento 03"); //posição 2

//        System.out.println(vetor.tamanho());
//        System.out.println(vetor);
//        System.out.println(vetor.busca(15)); realiza uma busca para trestar IF
//        System.out.println(vetor.buscaOP2("elemento 01"));
//        vetor2.adiciona("B");
//        vetor2.adiciona("c");
//        vetor2.adiciona("d");
//        vetor2.adiciona("f");
//        vetor2.adiciona("g");
//        vetor2.adiciona("h");

//          System.out.println("Dados: " + vetor2);
//          //Adicionar elemento em qualquer posição
//          vetor2.adicionaOP2(0, "a");
//          //Adicionar elemento em qualquer posição
//          System.out.println("Novos dados: " + vetor2);
        //Adicionando capacidade
        vetor3.adiciona("B");
        vetor3.adiciona("c");
        vetor3.adiciona("d");
        vetor3.adiciona("f");
        vetor3.adiciona("g");
        
        System.out.println(vetor3);
        
    }

}
