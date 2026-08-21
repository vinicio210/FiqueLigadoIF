package domain;

public class AtividadeMinistrante {

    private Integer id;
    private Atividade atividade;
    private Pessoa ministrante;

    public AtividadeMinistrante() {
    }

    public AtividadeMinistrante(Integer id, Atividade atividade, Pessoa ministrante) {
        this.id = id;
        this.atividade = atividade;
        this.ministrante = ministrante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Pessoa getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(Pessoa ministrante) {
        this.ministrante = ministrante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AtividadeMinistrante{");
        sb.append("id=").append(id);
        sb.append(", atividade=").append(atividade);
        sb.append(", ministrante=").append(ministrante);
        sb.append('}');
        return sb.toString();
    }
}
