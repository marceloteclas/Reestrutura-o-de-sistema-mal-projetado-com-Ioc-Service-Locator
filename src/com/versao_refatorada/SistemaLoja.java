package com.versao_refatorada;

import java.util.ArrayList;
import java.util.List;

public class SistemaLoja {
    private List<Produto> produtos = new ArrayList<>();
    private double totalVendas = 0;

    public void adicionarProduto(String nome, double preco) {
        Produto p = new Produto(nome, preco);
        produtos.add(p);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void venderProduto(int indice) {
        if (indice >= 0 && indice < produtos.size()) {
            Produto p = produtos.get(indice);
            totalVendas += p.getPreco();
        } else {
            throw new IllegalArgumentException("Produto inválido!");
        }
    }

    public ResumoLoja gerarResumo() {
        return new ResumoLoja(produtos, totalVendas);
    }

    public static void main(String[] args) {
        SistemaLoja loja = new SistemaLoja();
        Relatorio relatorio = new Relatorio();

        loja.adicionarProduto("Teclado", 100.0);
        loja.adicionarProduto("Mouse", 50.0);   
        loja.adicionarProduto("Monitor", 800.0);

        loja.venderProduto(0);
        loja.venderProduto(2);

        relatorio.imprimirRelatorio(loja.gerarResumo());
    }
}