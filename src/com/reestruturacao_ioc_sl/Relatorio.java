package com.reestruturacao_ioc_sl;

import java.util.List;

public class Relatorio {
    public void imprimirRelatorio(List<Produto> produtos, double totalVendas) {
        System.out.println("=== Relatório da Loja ===");
        int i = 1;
        for (Produto p : produtos) {
            System.out.println(i++ + ". " + p.getNome() + " - R$" + p.getPreco());
        }
        System.out.println("Total em vendas: R$" + totalVendas);
    }
}