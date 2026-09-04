package domain;

public class Inscricao {

    private Integer id;
    private Campeonato campeonato;
    private Aluno aluno;
    private Equipe equipe;

    public Inscricao() {
    }

    public Inscricao(Integer id, Campeonato campeonato, Aluno aluno, Equipe equipe) {
        this.id = id;
        this.campeonato = campeonato;
        this.aluno = aluno;
        this.equipe = equipe;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }


    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String toString() {
        String time = equipe == null ? "sem equipe" : equipe.getNome();
        return aluno.getNome() + " inscrito no " + campeonato.getNome() + " (" + time + ")";
    }
}
