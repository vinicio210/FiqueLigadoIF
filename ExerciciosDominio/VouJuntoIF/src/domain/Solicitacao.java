package domain;

public class Solicitacao {

    private Integer id;
    private Carona carona;
    private Aluno passageiro;
    private String dataSolicitacao;
    private SituacaoSolicitacaoEnum situacao;

    public Solicitacao() {
    }

    public Solicitacao(Integer id, Carona carona, Aluno passageiro, String dataSolicitacao,
                        SituacaoSolicitacaoEnum situacao) {
        this.id = id;
        this.carona = carona;
        this.passageiro = passageiro;
        this.dataSolicitacao = dataSolicitacao;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Carona getCarona() {
        return carona;
    }

    public void setCarona(Carona carona) {
        this.carona = carona;
    }

    public Aluno getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Aluno passageiro) {
        this.passageiro = passageiro;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }


    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public SituacaoSolicitacaoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoSolicitacaoEnum situacao) {
        this.situacao = situacao;
    }

    public String toString() {
        return passageiro.getNome() + " solicitou vaga em " + dataSolicitacao + " - situacao: " + situacao;
    }
}
