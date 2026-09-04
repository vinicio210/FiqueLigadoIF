package domain;

public class Campanha {

    private Integer id;
    private String titulo;
    private String descricao;
    private String objetivo;
    private String dataInicio;
    private String dataFim;
    private Double metaFinanceira;
    private Aluno responsavel;
    private TipoCampanhaEnum tipo;

    public Campanha() {
    }

    public Campanha(Integer id, String titulo, String descricao, String objetivo, String dataInicio,
                     String dataFim, Double metaFinanceira, Aluno responsavel, TipoCampanhaEnum tipo) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.metaFinanceira = metaFinanceira;
        this.responsavel = responsavel;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
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


    public Double getMetaFinanceira() {
        return metaFinanceira;
    }

    public void setMetaFinanceira(Double metaFinanceira) {
        this.metaFinanceira = metaFinanceira;
    }


    public Aluno getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Aluno responsavel) {
        this.responsavel = responsavel;
    }


    public TipoCampanhaEnum getTipo() {
        return tipo;
    }


    public void setTipo(TipoCampanhaEnum tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return titulo + " (" + tipo + ") meta: R$" + metaFinanceira + " - responsavel: " + responsavel;
    }
}
