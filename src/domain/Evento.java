package domain;

import java.time.LocalDate;

public class Evento {

    private Integer id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String linkBanner;
    private StatusEnum status;
    private Double valorInscricao;
    private Usuario responsavel;
    private Usuario cadastradoPor;

    public Evento() {
    }

    public Evento(Integer id, String nome, LocalDate dataInicio, LocalDate dataFim, String linkBanner,
                  StatusEnum status, Double valorInscricao, Usuario responsavel, Usuario cadastradoPor) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.linkBanner = linkBanner;
        this.status = status;
        this.valorInscricao = valorInscricao;
        this.responsavel = responsavel;
        this.cadastradoPor = cadastradoPor;
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getLinkBanner() {
        return linkBanner;
    }

    public void setLinkBanner(String linkBanner) {
        this.linkBanner = linkBanner;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(Double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public Usuario getCadastradoPor() {
        return cadastradoPor;
    }

    public void setCadastradoPor(Usuario cadastradoPor) {
        this.cadastradoPor = cadastradoPor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", dataInicio=").append(dataInicio);
        sb.append(", dataFim=").append(dataFim);
        sb.append(", linkBanner=").append(linkBanner);
        sb.append(", status=").append(status);
        sb.append(", valorInscricao=").append(valorInscricao);
        sb.append(", responsavel=").append(responsavel);
        sb.append(", cadastradoPor=").append(cadastradoPor);
        sb.append('}');
        return sb.toString();
    }
}
