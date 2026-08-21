package domain;

import java.time.LocalDateTime;

public class Inscricao {

    private Integer id;
    private LocalDateTime dataHoraInscricao;
    private Atividade atividade;
    private Usuario usuario;

    public Inscricao() {
    }

    public Inscricao(Integer id, LocalDateTime dataHoraInscricao, Atividade atividade, Usuario usuario) {
        this.id = id;
        this.dataHoraInscricao = dataHoraInscricao;
        this.atividade = atividade;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraInscricao() {
        return dataHoraInscricao;
    }

    public void setDataHoraInscricao(LocalDateTime dataHoraInscricao) {
        this.dataHoraInscricao = dataHoraInscricao;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inscricao{");
        sb.append("id=").append(id);
        sb.append(", dataHoraInscricao=").append(dataHoraInscricao);
        sb.append(", atividade=").append(atividade);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }
}
