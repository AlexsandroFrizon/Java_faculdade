package estruturadados;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //Método para adicionar Elementos no vetor
//    public void adiciona(String elemento) {
//        for (int i = 0; i < elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }
    public boolean adiciona(String elemento) {
        this.aumentacapacidade();
        if (tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    //Adicionar elemento em qualquer posição
    public boolean adicionaOP2(int posicao, String elemento) {
        //Verififacar se posição é valida
        if (!(posicao >= 0 && posicao < tamanho)) {
            System.out.println("Posição invalida");
        }
        this.aumentacapacidade();
        //mover todods os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return false;
    }

    //Aumentar capacidade do vetor
    private void aumentacapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //Realizar uma busca
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            System.out.println("Posição invalida");
        }
        return this.elementos[posicao];
    }

    //Verificar se elemento existe no vetor (busca sequencial)
    public int buscaOP2(String elementos) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elementos)) {
                return i;
            }
        }
        return -1;
    }

    //Verificar tamanho
    public int tamanho() {
        return this.tamanho;
    }

    //Imprimir os elementos do veotr
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    //remover elementos de um vetor
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            System.out.println("Posição invalida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }
}
