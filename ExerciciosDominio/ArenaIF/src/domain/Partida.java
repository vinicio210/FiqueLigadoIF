package domain;

public class Partida {

    private Integer id;
    private Campeonato campeonato;
    private Equipe equipe1;
    private Equipe equipe2;
    private String data;
    private Integer rodada;
    private Integer pontuacaoEquipe1;
    private Integer pontuacaoEquipe2;
    private SituacaoPartidaEnum situacao;

    public Partida() {
    }


    public Partida(Integer id, Campeonato campeonato, Equipe equipe1, Equipe equipe2, String data,
                    Integer rodada, Integer pontuacaoEquipe1, Integer pontuacaoEquipe2, SituacaoPartidaEnum situacao) {
        this.id = id;
        this.campeonato = campeonato;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.data = data;
        this.rodada = rodada;
        this.pontuacaoEquipe1 = pontuacaoEquipe1;
        this.pontuacaoEquipe2 = pontuacaoEquipe2;
        this.situacao = situacao;
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

    public Equipe getEquipe1() {
        return equipe1;
    }


    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    public Integer getRodada() {
        return rodada;
    }


    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    public Integer getPontuacaoEquipe1() {
        return pontuacaoEquipe1;
    }

    public void setPontuacaoEquipe1(Integer pontuacaoEquipe1) {
        this.pontuacaoEquipe1 = pontuacaoEquipe1;
    }

    public Integer getPontuacaoEquipe2() {
        return pontuacaoEquipe2;
    }

    public void setPontuacaoEquipe2(Integer pontuacaoEquipe2) {
        this.pontuacaoEquipe2 = pontuacaoEquipe2;
    }


    public SituacaoPartidaEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoPartidaEnum situacao) {
        this.situacao = situacao;
    }


    public String toString() {
        return "Rodada " + rodada + ": " + equipe1.getNome() + " " + pontuacaoEquipe1 + " x "
                + pontuacaoEquipe2 + " " + equipe2.getNome() + " - " + situacao;
    }
}
