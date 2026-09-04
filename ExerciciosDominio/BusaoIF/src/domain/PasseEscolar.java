package domain;

public class PasseEscolar {

    private Integer id;
    private String numero;
    private String dataEmissao;
    private String dataValidade;
    private SituacaoPasseEnum situacao;
    private SolicitacaoPasse solicitacao;

    public PasseEscolar() {
    }

    public PasseEscolar(Integer id, String numero, String dataEmissao, String dataValidade,
                         SituacaoPasseEnum situacao, SolicitacaoPasse solicitacao) {
        this.id = id;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
        this.situacao = situacao;
        this.solicitacao = solicitacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getDataEmissao() {
        return dataEmissao;
    }


    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }


    public String getDataValidade() {
        return dataValidade;
    }


    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }


    public SituacaoPasseEnum getSituacao() {
        return situacao;
    }


    public void setSituacao(SituacaoPasseEnum situacao) {
        this.situacao = situacao;
    }


    public SolicitacaoPasse getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(SolicitacaoPasse solicitacao) {
        this.solicitacao = solicitacao;
    }

    public String toString() {
        return "Passe " + numero + " de " + solicitacao.getEstudante().getNome()
                + " valido ate " + dataValidade + " - " + situacao;
    }
}
