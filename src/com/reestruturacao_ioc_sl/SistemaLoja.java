package com.reestruturacao_ioc_sl;

import java.util.ArrayList;
import java.util.List;

public class SistemaLoja {
    private List<Produto> produtos = new ArrayList<>();
    private double totalVendas = 0;

    public void adicionarProduto(String nome, double preco) {
        // Obtém a fábrica de produtos via Service Locator
        ProdutoFactory produtoFactory = ServiceLocator.get(ProdutoFactory.class);

        Produto novoProduto = produtoFactory.criar(nome, preco);
        produtos.add(novoProduto);
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

    public void gerarResumo() {
        Relatorio relatorio = ServiceLocator.get(Relatorio.class);
        relatorio.imprimirRelatorio(produtos, totalVendas);
    }
}