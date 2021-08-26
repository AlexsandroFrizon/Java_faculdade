
package estruturadados;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Fila financeiro = new Fila(10);
        Fila comercial = new Fila(10);
        String sen;
        int f = 001;
        int c = 001;

        
        System.out.println(" Atendimento Comercial, digite  (1)  ");
        System.out.println(" Atendimento Financeiro, digite (2)  ");
        

        for (int j = 0; j < 10; j++) {
            System.out.print("\nPor favor, informe o número correspondente ao departamento: ");
            int menu = new Scanner(System.in).nextInt();
            
            if (menu == 1) {
                sen = "F00" + f;
                financeiro.enfileirar(sen);
                System.out.println("\nsetor comercial!");
                System.out.println("Sua senha é a: " + sen);
                f++;
            } else {
                sen = "C00" + c;
                comercial.enfileirar(sen);
                System.out.println("etor comercial!");
                System.out.println("Sua senha é a: " + sen);
                c++;
            }
        }
        
        System.out.println("\n Responsável  1 ");
        System.out.println("Senha: " + financeiro.proximoElemento());
        financeiro.desenfileirar();
        
        System.out.println("\n Responsável 2 ");
        System.out.println("Senha: " + comercial.proximoElemento());
        comercial.desenfileirar();
        
        System.out.println("\n Responsável 3 ");
        System.out.println("Senha: " + financeiro.proximoElemento());
        financeiro.desenfileirar();
        
        System.out.println("\n Responsável 4 ");
        System.out.println("Senha: " + comercial.proximoElemento());
        comercial.desenfileirar();
        
        System.out.println("\n Responsável 5 ");
        System.out.println("Senha: " + financeiro.proximoElemento());
        financeiro.desenfileirar();
        
        System.out.println("\n Responsável 6 ");
        System.out.println("Senha: " + comercial.proximoElemento());
        comercial.desenfileirar();
    }

    public static class Fila {

        private String[] elementos;
        private int tamanho;

        public int getTamanho() {
            return tamanho;
        }

        public Fila(int capacidade) {
            this.elementos = new String[capacidade];
            this.tamanho = 0;
        }

        public void enfileirar(String elemento) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }

        public boolean estaVazia() {
            return this.tamanho == 0;
        }

        public String proximoElemento() {
            if (this.estaVazia()) {
                return null;
            }
            return this.elementos[0];
        }

        public String desenfileirar() {
            if (estaVazia()) {
                return null;
            }

            String elem = elementos[0];

            for (int i = 0; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;

            return elem;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("[");
            for (int i = 0; i < tamanho; i++) {
                s.append(this.elementos[i]);
                s.append(",");
            }
            if (this.tamanho > 0) {
                s.append(this.elementos[this.tamanho - 1]);
            }
            s.append("]");
            return s.toString();
        }

        private void aumentaCapacidade() {
            if (this.tamanho == this.elementos.length) {
                String[] elementosNovos = new String[this.elementos.length * 2];
                for (int i = 0; i < this.elementos.length; i++) {
                    elementosNovos[i] = this.elementos[i];
                }
                this.elementos = elementosNovos;
            }
        }
    }
}
