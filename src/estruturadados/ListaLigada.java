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
public class ListaLigada {

    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(this.primeira, elemento);
        this.primeira = nova;
        if (this.totalDeElementos == 0) {
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }

    public void adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        return null;
    }
//    StringBuuilder = new StringBuilder("[");
//    Celula atual = primeira;
//    for (int i =0; i < this.totalDeElementos-1; i+){
//    builder.append(",");
//    atual = atual.getProxima();
//    }
//    builder.append(atual.getElemento());
//    builder.append("]");
//    return builder.toString();

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Celula pegarCelula(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            System.out.println("posição não existe");
        }
        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }

    public void adiciona(int posisao, Object elemento) {
        if (posisao == 0) {
            this.adicionaNoComeco(elemento);
        } else if (posisao == this.totalDeElementos) {
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegarCelula(posisao - 1);
            Celula nova = new Celula(anterior.getProxima(), elemento);
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
    }

    public Object pegan(int posicao) {
        return this.pegarCelula(posicao).getElemento();
    }

    public void removerDoComeco() {
        if (!this.posicaoOcupada(0)) {
            System.out.println("posição ocupada");
        }
        this.primeira = this.primeira.getProxima();
        this.totalDeElementos--;
        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public void removeFim() {
        if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
            System.out.println("posição não existente");
        }
        if (this.totalDeElementos == 1) {
            this.removerDoComeco();
        } else {
            Celula penultima = this.pegarCelula(this.totalDeElementos - 2);
            penultima.setProxima(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            System.out.println("posição não exixtente");
        }
        if (posicao == 0) {
            this.removerDoComeco();
        } else if (posicao == this.totalDeElementos - 1) {
            this.removeFim();
        } else {
            Celula anterior = this.pegarCelula(posicao - 1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();
            anterior.setProxima(proxima);
            this.totalDeElementos--;
        }
    }
}
