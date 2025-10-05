package algoritmos;

public class ArvoreBinaria {

    private No raiz;

    private class No {
        int valor;
        No esquerda;
        No direita;

        No(int valor) {
            this.valor = valor;
            direita = null;
            esquerda = null;
        }
    }

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
        } else {
            inserir(raiz, valor);
        }
    }

    private void inserir(No node, int valor) {
        // Verifica se a árvore já foi criada
        if (node != null) {
            // Verifica se o valor a ser inserido é menor que o nodo corrente da árvore, se sim vai para subárvore esquerda
            if (valor < node.valor) {
                // Se tiver elemento no nodo esquerdo continua a busca
                if (node.esquerda != null) {
                    inserir(node.esquerda, valor);
                } else {
                    // Se nodo esquerdo vazio insere o novo nodo aqui
                    System.out.println("  Inserindo " + valor + " a esquerda de " + node.valor);
                    node.esquerda = new No(valor);
                }
            // Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se sim vai para subárvore direita
            } else if (valor > node.valor) {
                // Se tiver elemento no nodo direito continua a busca
                if (node.direita != null) {
                    inserir(node.direita, valor);
                } else {
                    // Se nodo direito vazio insere o novo nodo aqui
                    System.out.println("  Inserindo " + valor + " a direita de " + node.valor);
                    node.direita = new No(valor);
                }
            }
        }
    }

    public void prefixado() {
        prefixado(raiz);
    }

    private void prefixado(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            prefixado(no.esquerda);
            prefixado(no.direita);
        }
    }

    public void posfixado() {
        posfixado(raiz);
    }

    private void posfixado(No no) {
        if (no != null) {
            posfixado(no.esquerda);
            posfixado(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    public void emOrdem() {
        emOrdem(raiz);
    }

    private void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdem(no.direita);
        }
    }
}