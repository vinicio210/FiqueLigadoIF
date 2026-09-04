package domain;

public class ItemVenda {

    private Integer id;
    private Venda venda;
    private Produto produto;
    private Integer quantidade;
    private Double precoUnitario;

    public ItemVenda() {
    }

    public ItemVenda(Integer id, Venda venda, Produto produto, Integer quantidade, Double precoUnitario) {
        this.id = id;
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }


    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }


    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String toString() {
        return quantidade + "x " + produto.getNome() + " a R$" + precoUnitario;
    }
}
