package com.versao_refatorada;

public class ProdutoFactoryImpl implements ProdutoFactory {
    @Override
    public Produto criar(String nome, double preco) {
        return new Produto(nome, preco);
    }
}
