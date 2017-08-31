package br.senac.asterix.lojadeeletronicos.validadores;

import br.senac.asterix.lojadeeletronicos.classes.Produto;
import br.senac.asterix.lojadeeletronicos.exceptions.ProdutoException;

public class ValidadorProduto {

    public static void validar(Produto produto) throws ProdutoException {
        if (produto.getNome() == null || "".equals(produto.getNome())) {
            throw new ProdutoException("É necessário informar um nome ao produto");
        }
        if (produto.getCategoria() == null || "".equals(produto.getCategoria())) {
            throw new ProdutoException("É necessário informar a categoria do produto");
        }
        if (produto.getValorCompra() == null) {
            throw new ProdutoException("É necessário informar o valor do produto");
        }
        if (produto.getValorVenda() == null) {
            throw new ProdutoException("É necessário informar a quantidade do produto");
        }
    }
}
