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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {

    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    public ConjuntoEspalhamento() {
        for (int i = 0; i < 26; i++) {
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }

    }

    private int calculaIndicedetabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }

    //Adiciona palavra
    public void adicionar(String palavra) {
        if (!this.contem(palavra)) {
            int indice = this.calculaIndicedetabela(palavra);
            List<String> lista = this.tabela.get(indice);
        }
    }

    //Remover uma palavra
    public void remover(String palavra) {
        if (this.contem(palavra)) {
            int indice = this.calculaIndicedetabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
        }
    }

    //Verificar se uma palavra está no conjunto
    public boolean contem(String palavra) {
        int indice = this.calculaIndicedetabela(palavra);
        List<String> lista = this.tabela.get(indice);
        return lista.contains(palavra);
    }

    //Recuperar todas as palaras do conjunto
    public List<String> pegaTodas() {
        List<String> palavras = new ArrayList<String>();

        for (int i = 0; i < this.tabela.size(); i++) {
            palavras.addAll(this.tabela.get(i));
        }
        return palavras;
    }

    //Informar o tamanho do conjunto
    private int tamanho = 0;

    public int tamanho() {
        return this.tamanho;
    }

    //Espalhando melhor
    private int calculaCodigoDeEspalhamento(String palavra) {
        int codigo = 1;
        for (int i = 0; i < palavra.length(); i++) {
            codigo = 31 * codigo + palavra.charAt(i);
        }
        return codigo;
    }

    //Tabela dinâmica
    private int calculaIndiceDaTabela(String palavra) {
        int codigoDeEspalhamento
                = this.calculaCodigoDeEspalhamento(palavra);
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % tabela.size();
    }

    //Tabela dinâmica
    private void verificaCarga() {
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;
        if (carga > 0.75) {
            this.redimensionaTabela(capacidade * 2);
        } else if (carga < 0.25) {
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }
    //Tabela dinâmica
    private void redimensionaTabela(int novaCapacidade) {
        List<String> palavras = this.pegaTodas();//1) Guarda em uma Lista todas as palavras do Conjunto 
        this.tabela.clear();//2) Limpa a tabela através do método clear() que toda Lista do Java tem. 
        for (int i = 0; i < novaCapacidade; i++) {//3) Inicializa a Tabela com a quantidade Lista da novaCapacidade.
            this.tabela.add(new LinkedList<String>());
        }
        for (String palavra : palavras) { //4) Guarda novamente as palavras no Conjunto.
            this.adicionar(palavra);
        }
    }
}
