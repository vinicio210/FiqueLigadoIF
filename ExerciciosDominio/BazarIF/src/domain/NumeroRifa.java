package domain;

public class NumeroRifa {

    private Integer id;
    private Campanha campanha;
    private Double valor;
    private Aluno comprador;
    private SituacaoNumeroRifaEnum situacao;

    public NumeroRifa() {
    }

    public NumeroRifa(Integer id, Campanha campanha, Double valor, Aluno comprador,
                       SituacaoNumeroRifaEnum situacao) {
        this.id = id;
        this.campanha = campanha;
        this.valor = valor;
        this.comprador = comprador;
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


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Aluno getComprador() {
        return comprador;
    }

    public void setComprador(Aluno comprador) {
        this.comprador = comprador;
    }

    public SituacaoNumeroRifaEnum getSituacao() {
        return situacao;
    }


    public void setSituacao(SituacaoNumeroRifaEnum situacao) {
        this.situacao = situacao;
    }


    public String toString() {
        String qm = comprador == null ? "ninguem ainda" : comprador.getNome();
        return "Numero da rifa " + campanha.getTitulo() + " - R$" + valor + " - " + situacao + " (" + qm + ")";
    }
}
