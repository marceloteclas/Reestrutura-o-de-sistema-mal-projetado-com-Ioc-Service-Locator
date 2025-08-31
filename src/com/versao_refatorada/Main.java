package com.versao_refatorada;

public class Main {
    public static void main(String[] args) {
        ServiceLocator.register(Relatorio.class, new RelatorioConsole());
        ServiceLocator.register(ProdutoFactory.class, new ProdutoFactoryImpl());
        ServiceLocator.register(GeradorResumo.class, new GeradorResumoLoja());

        SistemaLoja loja = new SistemaLoja();

        loja.adicionarProduto("Teclado", 100.0);
        loja.adicionarProduto("Mouse", 50.0);   
        loja.adicionarProduto("Monitor", 800.0);

        loja.venderProduto(0);
        loja.venderProduto(2);

        loja.gerarResumo();
    }
}