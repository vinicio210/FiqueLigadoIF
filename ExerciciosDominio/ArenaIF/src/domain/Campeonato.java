package domain;

public class Campeonato {

    private Integer id;
    private String nome;
    private String jogo;
    private String dataInicio;
    private String dataFim;
    private Integer maxParticipantes;
    private FormatoCompeticaoEnum formato;
    private SituacaoCampeonatoEnum situacao;

    public Campeonato() {
    }


    public Campeonato(Integer id, String nome, String jogo, String dataInicio, String dataFim,
                       Integer maxParticipantes, FormatoCompeticaoEnum formato, SituacaoCampeonatoEnum situacao) {
        this.id = id;
        this.nome = nome;
        this.jogo = jogo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.maxParticipantes = maxParticipantes;
        this.formato = formato;
        this.situacao = situacao;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }


    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getMaxParticipantes() {
        return maxParticipantes;
    }


    public void setMaxParticipantes(Integer maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }


    public FormatoCompeticaoEnum getFormato() {
        return formato;
    }

    public void setFormato(FormatoCompeticaoEnum formato) {
        this.formato = formato;
    }


    public SituacaoCampeonatoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoCampeonatoEnum situacao) {
        this.situacao = situacao;
    }

    public String toString() {
        return nome + " (" + jogo + ") - formato: " + formato + " - situacao: " + situacao;
    }
}
