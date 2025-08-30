package com.reestruturacao_ioc_sl;

public interface ProdutoFactory {
    Produto criar(String nome, double preco);
}
