package br.senac.asterix.lojadeeletronicos.classes;

import java.math.BigDecimal;
import java.util.Date;

public class Produto {

    private long id;
    private String nome;
    private String descricao;
    private BigDecimal valorCompra;
    private BigDecimal valorVenda;
    private String categoria;
    private Date dtCadastro;

    public Produto() {

    }

    public Produto(long id, String nome, String descricao, BigDecimal valorCompra, BigDecimal valorVenda, String categoria, Date dtCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.categoria = categoria;
        this.dtCadastro = dtCadastro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
}
