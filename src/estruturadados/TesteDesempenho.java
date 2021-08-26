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
public class TesteDesempenho {
    public static void main (String[] args){
        long inicio = System.currentTimeMillis();
        
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        
        for (int i = 0; i < 50000; i++) {
            conjunto.adicionar("palavra" + i);
        }
        
        for (int i = 0; i < 50000; i++) {
            conjunto.contem("palavra"  + i);
        }
        
        conjunto.tamanho();
        System.out.println(conjunto);
    
   
}
}
