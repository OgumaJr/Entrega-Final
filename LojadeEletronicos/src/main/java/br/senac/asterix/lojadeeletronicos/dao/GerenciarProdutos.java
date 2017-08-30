package br.senac.asterix.lojadeeletronicos.dao;
import java.sql.Connection; //realizar conexão com o BCO.
import java.sql.PreparedStatement; //preparar dados para o BCO.
import java.sql.ResultSet; //exibir resultados do BCO.
import java.sql.SQLException; //tratar erros de acesso ao BCO.
import java.util.ArrayList; //array com dados do BCO.
import java.util.List; //listar dados do BCO.

//classe que trabalha os dados para o BCO.
public class GerenciarProdutos {

    //realizar acessos ao BCO.
    public class DaoProduto{

        //cadastrar produto no BCO.
        public static void inserirProduto(Produto produto) throws SQLException, Exception {

            //string de inserção BCO.
            String sql = "INSERT INTO produto (id, nome, descricao, valorCompra, valorVenda, categoria, dthrCadastro) VALUES (?, ?, ?, ?, ?, ?, ?)";

            //verificar situação da conexão
            Connection connection = null;

            //verificar situação para preparar os comandos SQL
            PreparedStatement preparedStatement = null;
            try {
                //abrir conexão com o BCO.
                connection = ConnectionUtils.getConnection();

                //criar execução dos comandos SQL
                preparedStatement = connection.prepareStatement(sql);

                //obter conteúdo dos campos
                preparedStatement.setLong(1, produto.getId());
                preparedStatement.setString(2, produto.getNome());            
                preparedStatement.setString(3, produto.getDescricao());
                preparedStatement.setBigDecimal(4, produto.getValorCompra());
                preparedStatement.setBigDecimal(5, produto.getValorVenda());
                preparedStatement.setString(6, produto.getCategoria());
                preparedStatement.setDate(7, produto.getMomento());

                //executar os comandos SQL no BCO.
                preparedStatement.execute();
            }finally {

                //verificar situação atual dos comandos
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }

                //verificar situação atual da conexão
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            }
        }
                
        //listar produtos do BCO.
        public static List<Produto> listarProduto() throws SQLException, Exception {
            
            //montar string dos produtos
            String sql = "SELECT * FROM produto";
            
            //listar produtos
            List<Produto> listarProduto = null;
            
            //verificar situação da conexão
            Connection connection = null;
            
            //verificar situação para preparar os comandos SQL
            PreparedStatement preparedStatement = null;
            
            //armazenar resultados do BCO.
            ResultSet result = null;
            try {
                //abrir conexão com o BCO.
                connection = ConnectionUtils.getConnection();
                
                //criar execução dos comandos SQL
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setBoolean(1, true);

                //consultar o BCO.
                result = preparedStatement.executeQuery();
            
                //inserir cada item do resultado
                while (result.next()) {

                    //iniciar lista
                    if (listarProduto == null) {
                        listarProduto = new ArrayList<Produto>();
                    }

                    //criar instância e popular com os dados do BD
                    Produto produto = new Produto();
                    produto.setCodigoProduto(result.getLong("id"));
                    produto.setNomeProduto(result.getString("nome"));                
                    produto.setMarca(result.getString("descricao"));
                    produto.setCategoria(result.getBigDecimal("valorCompra"));
                    produto.setQuantidade(result.getBigDecimal("valorVenda"));
                    produto.setValor(result.getString("categoria"));
                    produto.setDescricao(result.getDate("dthrCadastro"));                

                    //adicionar dados na lista
                    listarProduto.add(produto);
                }
            
            }finally {
                //fechar resultado
                if (result != null && !result.isClosed()) {
                    result.close();
                }

                //fechar consulta
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }

                //fechar conexão
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            }
        
        //retornar dados do BCO.
        return listarProduto;
        }
       
        //buscar nome produto no BCO.
        public static List<Produto> procurarProduto(String valor) throws SQLException, Exception {
            
            //criar string de consulta
            String sql = "SELECT * FROM produto WHERE (produto.nome LIKE(?)";
            
            //listar resultado
            List<Produto> listarProduto = null;
            
            //verificar situação da conexão
            Connection connection = null;
            
            //verificar situação para preparar os comandos SQL
            PreparedStatement preparedStatement = null;
            
            //armazenar resultado no BCO.
            ResultSet result = null;
            try {
                //abrir conexão com o BCO.
                connection = ConnectionUtils.getConnection();
                
                //criar execução dos comandos SQL
                preparedStatement = connection.prepareStatement(sql);
                
                //receber parâmetro de busca
                preparedStatement.setString(1, "%");

                //executar consulta SQL no BCO.
                result = preparedStatement.executeQuery();

                //inserir cada item do resultado
                while (result.next()) {
                    
                    //iniciar lista
                    if (listarProduto == null) {
                        listarProduto = new ArrayList<Produto>();
                    }
                    
                    //criar instância e popular com os dados do BD
                    Produto produto = new Produto();
                    produto.setCodigoProduto(result.getLong("id"));
                    produto.setNomeProduto(result.getString("nome"));                
                    produto.setMarca(result.getString("descricao"));
                    produto.setCategoria(result.getBigDecimal("valorCompra"));
                    produto.setQuantidade(result.getBigDecimal("valorVenda"));
                    produto.setValor(result.getString("categoria"));
                    produto.setDescricao(result.getDate("dthrCadastro"));
                    
                    //adicionar dados na lista
                    listarProduto.add(produto);
                }
                
            } finally {
                
                //fechar resultado
                if (result != null && !result.isClosed()) {
                    result.close();
                }
                
                //fechar consulta
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
                //fechar conexão
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            }
            
            //listar produto do BCO.
            return listarProduto;
        }
    }
}