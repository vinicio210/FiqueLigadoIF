package domain;

public class AreaDaAtividade {

    private Integer id;
    private Area area;
    private Atividade atividade;

    public AreaDaAtividade() {
    }

    public AreaDaAtividade(Integer id, Area area, Atividade atividade) {
        this.id = id;
        this.area = area;
        this.atividade = atividade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AreaDaAtividade{");
        sb.append("id=").append(id);
        sb.append(", area=").append(area);
        sb.append(", atividade=").append(atividade);
        sb.append('}');
        return sb.toString();
    }
}
