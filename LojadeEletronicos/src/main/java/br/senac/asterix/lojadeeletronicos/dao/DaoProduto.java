package br.senac.asterix.lojadeeletronicos.dao;

import br.senac.asterix.lojadeeletronicos.classes.Produto;
import br.senac.asterix.lojadeeletronicos.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoProduto {

    public static void inserirProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO produto (nome, descricao, "
                + "vl_compra, vl_venda, categoria, dt_cadastro)"
                + " VALUES (?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";

        Connection connection = null;

        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setBigDecimal(3, produto.getValorCompra());
            preparedStatement.setBigDecimal(4, produto.getValorVenda());
            preparedStatement.setString(5, produto.getCategoria());

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void atualizarProduto(Produto produto) throws SQLException {
        String sql = "UPDATE produto SET nome=?, descricao=?, vl_compra=?,"
                + " vl_venda=?, categoria=? WHERE (produto.id=?)";

        Connection connection = null;

        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setBigDecimal(3, produto.getValorCompra());
            preparedStatement.setBigDecimal(4, produto.getValorVenda());
            preparedStatement.setString(5, produto.getCategoria());
            preparedStatement.setLong(6, produto.getId());

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static ArrayList<Produto> procurarProduto(String nomeProduto) throws SQLException {
        String sql = "SELECT * FROM produto WHERE (produto.nome LIKE(?))";

        ArrayList<Produto> listaProdutos = null;

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "%" + nomeProduto + "%");

            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<>();
                }
                Produto produto = new Produto();
                produto.setId(result.getLong("id"));
                produto.setNome(result.getString("nome"));
                produto.setDescricao(result.getString("descricao"));
                produto.setValorCompra(result.getBigDecimal("vl_compra"));
                produto.setValorVenda(result.getBigDecimal("vl_venda"));
                produto.setCategoria(result.getString("categoria"));
                produto.setDtCadastro(result.getDate("dt_cadastro"));

                listaProdutos.add(produto);
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }

            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }

            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        return listaProdutos;
    }

    public static Produto obterProduto(long id) throws SQLException {
        String sql = "SELECT * FROM produto WHERE (produto.id=?)";

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, id);

            result = preparedStatement.executeQuery();
            if (result.next()) {
                Produto produto = new Produto();
                produto.setId(result.getLong("id"));
                produto.setNome(result.getString("nome"));
                produto.setDescricao(result.getString("descricao"));
                produto.setValorCompra(result.getBigDecimal("vl_compra"));
                produto.setValorVenda(result.getBigDecimal("vl_venda"));
                produto.setCategoria(result.getString("categoria"));
                produto.setDtCadastro(result.getDate("dt_cadastro"));

                return produto;
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        return null;
    }

    public static void excluirProduto(long id) throws SQLException {
        String sql = "DELETE FROM produto WHERE (produto.id=?)";

        Connection connection = null;

        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, id);

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}
