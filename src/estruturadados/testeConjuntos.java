/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexs
 */
public class testeConjuntos {

    public static void main(String[] args) {
        ConjuntoEspalhamento ce = new ConjuntoEspalhamento();

        List<String> nomes = new ArrayList<String>();
        
        
        nomes.add("rafael");
        nomes.add("Ana");
        nomes.add("Paulo");
        //Imprimir nomes do conjunto
        System.out.println("Imprimindo nomes do conjunto:" + nomes);
        
        
        //Remove o nome do conjunto
        nomes.remove("rafael");
        System.out.println("Removendo nome do conjunto: " + nomes);
        
        
        //Não consegui verificar o nome no conjunto
        boolean contains = nomes.contains(ce);
        nomes.contains(nomes);
        
       
        //Verificar  tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + nomes.size());
    }
}
