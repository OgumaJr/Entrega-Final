package br.senac.asterix.lojadeeletronicos.servicos;
import java.util.List; //listar produtos

public class ServerProduto {
 
    //inserir produto no BCO.
    public static void cadastrarProduto(Produto produto) throws ProdutoException, DataSourceException {

        //validar produto
        ValidadorProduto.validar(produto);

        try {
            //inserir produto
            GerenciarProduto.inserirProduto(produto);
        } catch (Exception e) {
            //imprimir erro e devolver exceção
            e.printStackTrace();
            throw new DataSourceException("Erro de BCO.", e);
        }
    }
    
    //pesquisar produto no BCO.
    public static List<Produto> procurarProduto(String produto) throws ProdutoException, DataSourceException {
        try {
            //busca produtos com ou sem parâmetro
            if (produto == null || "".equals(produto)) {
                return GerenciarProduto.listarProduto();
            } else {
                return GerenciarProduto.procurarProduto(produto);
            }
        } catch (Exception e) {
            //imprimir erro e devolver exceção
            e.printStackTrace();
            throw new DataSourceException("Erro de BCO.", e);
        }
    }
}