package domain;

public class ParticipacaoAgendamento {

    private Integer id;
    private Agendamento agendamento;
    private Aluno aluno;

    public ParticipacaoAgendamento() {
    }

    public ParticipacaoAgendamento(Integer id, Agendamento agendamento, Aluno aluno) {
        this.id = id;
        this.agendamento = agendamento;
        this.aluno = aluno;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Aluno getAluno() {
        return aluno;
    }


    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }


    public String toString() {
        return aluno.getNome() + " confirmado em: " + agendamento;
    }
}
