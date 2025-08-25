package com.versao_inicial;

// Classe principal - God Object
public class SistemaLoja {
    Produto[] produtos = new Produto[10]; // atributos expostos
    int totalProdutos = 0;
    double totalVendas = 0;

    public void adicionarProduto(String nome, double preco) {
        produtos[totalProdutos] = new Produto(nome, preco);
        totalProdutos++;
        System.out.println("Produto adicionado: " + nome + " - R$" + preco);
    }

    public void listarProdutos() {
        for (int i = 0; i < totalProdutos; i++) {
            System.out.println((i + 1) + ". " + produtos[i].nome + " - R$" + produtos[i].preco);
        }
    }

    public void venderProduto(int indice) {
        if (indice >= 0 && indice < totalProdutos) {
            totalVendas += produtos[indice].preco;
            System.out.println("Produto vendido: " + produtos[indice].nome + " por R$" + produtos[indice].preco);
        } else {
            System.out.println("Produto inválido!");
        }
    }

    public static void main(String[] args) {
        SistemaLoja loja = new SistemaLoja();
        Relatorio relatorio = new Relatorio();

        loja.adicionarProduto("Teclado", 100.0);
        loja.adicionarProduto("Mouse", 50.0);
        loja.adicionarProduto("Monitor", 800.0);

        loja.listarProdutos();
        loja.venderProduto(0);
        loja.venderProduto(2);

        relatorio.gerarRelatorio(loja.produtos, loja.totalProdutos, loja.totalVendas);
    }
}

