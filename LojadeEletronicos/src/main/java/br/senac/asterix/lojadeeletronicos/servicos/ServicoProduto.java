package br.senac.asterix.lojadeeletronicos.servicos;

import br.senac.asterix.lojadeeletronicos.classes.Produto;
import br.senac.asterix.lojadeeletronicos.dao.DaoProduto;
import br.senac.asterix.lojadeeletronicos.exceptions.DataSourceException;
import br.senac.asterix.lojadeeletronicos.exceptions.ProdutoException;
import br.senac.asterix.lojadeeletronicos.validadores.ValidadorProduto;
import java.util.ArrayList;

public class ServicoProduto {

    public static void cadastrarProduto(Produto produto) throws ProdutoException, DataSourceException {
        ValidadorProduto.validar(produto);

        try {
            DaoProduto.inserirProduto(produto);
        } catch (Exception e) {
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static void atualizarProduto(Produto produto) throws ProdutoException, DataSourceException {
        ValidadorProduto.validar(produto);

        try {
            DaoProduto.atualizarProduto(produto);
        } catch (Exception e) {
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static ArrayList<Produto> procurarProduto(String nomeProduto) throws DataSourceException {
        try {
            return DaoProduto.procurarProduto(nomeProduto);
        } catch (Exception e) {
            throw new DataSourceException("Erro na fonte de dados", e);
        }        
    }

    public static Produto obterProduto(long id) throws DataSourceException {
        try {
           return DaoProduto.obterProduto(id);
        } catch (Exception e) {
           throw new DataSourceException("Erro na fonte de dados", e); 
        }        
    }

    public static void excluirProduto(long id) throws DataSourceException {
        try {
            DaoProduto.excluirProduto(id);
        } catch (Exception e) {
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
