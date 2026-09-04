package domain;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidadeDisponivel;
    private String categoria;

    public Produto() {
    }


    public Produto(Integer id, String nome, String descricao, Double preco,
                    Integer quantidadeDisponivel, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.categoria = categoria;
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

    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }


    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public String toString() {
        return nome + " - R$" + preco + " (" + quantidadeDisponivel + " disponiveis)";
    }
}
