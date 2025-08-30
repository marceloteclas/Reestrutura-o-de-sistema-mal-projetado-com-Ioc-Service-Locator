package com.versao_refatorada;

import java.util.List;

public class ResumoLoja {
    private List<Produto> produtos;
    private double totalVendas;

    public ResumoLoja(List<Produto> produtos, double totalVendas) {
        this.produtos = produtos;
        this.totalVendas = totalVendas;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
}