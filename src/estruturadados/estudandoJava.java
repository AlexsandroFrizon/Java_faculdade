/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.ArrayList;

/**
 *
 * @author alexs
 */
public class estudandoJava {
    public static void main(String[] args){
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("A");
        arraylist.add("B");
        System.out.println(arraylist);
        
        boolean exite = arraylist.contains("C");
        if (exite) {
            System.out.println("Exite");
        }
        else{
            System.out.println("Não exite");
        }
        
        int pos = arraylist.indexOf("S");
        if (pos> -1) {
            System.out.println("Elemento existe na posição: " +pos );
        }
        else{
            System.out.println("O elemento não existe!");
        }
        
        System.out.println(arraylist.get(0));
    }
    
}
