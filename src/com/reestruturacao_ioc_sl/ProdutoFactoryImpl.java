package com.reestruturacao_ioc_sl;

public class ProdutoFactoryImpl implements ProdutoFactory {
    @Override
    public Produto criar(String nome, double preco) {
        return new Produto(nome, preco);
    }
}
