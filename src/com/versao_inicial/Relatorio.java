package com.versao_inicial;

// Classe Relatorio - mistura responsabilidades (gera relatório + imprime)
public class Relatorio {
    public void gerarRelatorio(Produto[] produtos, int total, double totalVendas) {
        System.out.println("=== Relatório da Loja ===");
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". " + produtos[i].nome + " - R$" + produtos[i].preco);
        }
        System.out.println("Total de produtos cadastrados: " + total);
        System.out.println("Total em vendas: R$" + totalVendas);
    }
}

