package com.reestruturacao_ioc_sl;

public class Relatorio {
    public void imprimirRelatorio(ResumoLoja resumo) {
        System.out.println("=== Relatório da Loja ===");
        int i = 1;
        for (Produto p : resumo.getProdutos()) {
            System.out.println(i++ + ". " + p.getNome() + " - R$" + p.getPreco());
        }
        System.out.println("Total em vendas: R$" + resumo.getTotalVendas());
    }
}