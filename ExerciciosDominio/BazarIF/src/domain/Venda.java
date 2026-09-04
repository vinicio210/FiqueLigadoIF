package domain;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Integer id;
    private Campanha campanha;
    private Aluno vendedor;
    private Aluno comprador;
    private String data;
    private FormaPagamentoEnum formaPagamento;
    private SituacaoVendaEnum situacao;

    private List<ItemVenda> itens = new ArrayList<>();

    public Venda() {
    }

    public Venda(Integer id, Campanha campanha, Aluno vendedor, Aluno comprador, String data,
                 FormaPagamentoEnum formaPagamento, SituacaoVendaEnum situacao) {
        this.id = id;
        this.campanha = campanha;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }


    public Aluno getVendedor() {
        return vendedor;
    }

    public void setVendedor(Aluno vendedor) {
        this.vendedor = vendedor;
    }


    public Aluno getComprador() {
        return comprador;
    }

    public void setComprador(Aluno comprador) {
        this.comprador = comprador;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public FormaPagamentoEnum getFormaPagamento() {
        return formaPagamento;
    }


    public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public SituacaoVendaEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoVendaEnum situacao) {
        this.situacao = situacao;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public String toString() {
        return "Venda de " + vendedor.getNome() + " para " + comprador.getNome() + " em " + data
                + " (" + formaPagamento + ") - " + situacao + " - itens: " + itens.size();
    }
}
