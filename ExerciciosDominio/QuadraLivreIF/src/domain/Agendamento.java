package domain;

public class Agendamento {

    private Integer id;
    private Quadra quadra;
    private ModalidadeEnum modalidade;
    private String data;
    private String horarioInicial;
    private String horarioFinal;
    private SituacaoAgendamentoEnum situacao;

    public Agendamento() {
    }

    public Agendamento(Integer id, Quadra quadra, ModalidadeEnum modalidade, String data,
                        String horarioInicial, String horarioFinal, SituacaoAgendamentoEnum situacao) {
        this.id = id;
        this.quadra = quadra;
        this.modalidade = modalidade;
        this.data = data;
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
        this.situacao = situacao;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }


    public ModalidadeEnum getModalidade() {
        return modalidade;
    }

    public void setModalidade(ModalidadeEnum modalidade) {
        this.modalidade = modalidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public String getHorarioInicial() {
        return horarioInicial;
    }


    public void setHorarioInicial(String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public SituacaoAgendamentoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoAgendamentoEnum situacao) {
        this.situacao = situacao;
    }

    public String toString() {
        return modalidade + " na " + quadra.getNome() + " dia " + data + " das " + horarioInicial
                + " as " + horarioFinal + " - situacao: " + situacao;
    }
}
