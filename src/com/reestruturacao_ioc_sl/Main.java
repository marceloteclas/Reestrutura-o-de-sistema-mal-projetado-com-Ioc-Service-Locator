package com.reestruturacao_ioc_sl;

public class Main {
    public static void main(String[] args) {
        // Configuração inicial (registro no Service Locator)
        ServiceLocator.register(Relatorio.class, new Relatorio());
        ServiceLocator.register(ProdutoFactory.class, new ProdutoFactoryImpl());

        SistemaLoja loja = new SistemaLoja();

        loja.adicionarProduto("Teclado", 100.0);
        loja.adicionarProduto("Mouse", 50.0);   
        loja.adicionarProduto("Monitor", 800.0);

        loja.venderProduto(0);
        loja.venderProduto(2);

        loja.gerarResumo();
    }
}