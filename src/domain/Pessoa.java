package domain;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private Integer id;
    private String nome;
    private String linkFoto;
    private String biografia;
    private String email;

    private List<AtividadeMinistrante> atividadesMinistradas = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String linkFoto, String biografia, String email) {
        this.id = id;
        this.nome = nome;
        this.linkFoto = linkFoto;
        this.biografia = biografia;
        this.email = email;
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

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AtividadeMinistrante> getAtividadesMinistradas() {
        return atividadesMinistradas;
    }

    public void setAtividadesMinistradas(List<AtividadeMinistrante> atividadesMinistradas) {
        this.atividadesMinistradas = atividadesMinistradas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", linkFoto=").append(linkFoto);
        sb.append(", biografia=").append(biografia);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
}
