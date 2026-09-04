package domain;

public class Veiculo {

    private Integer id;
    private String placa;
    private String modelo;
    private String cor;
    private Integer capacidadeMaxima;

    public Veiculo() {
    }


    public Veiculo(Integer id, String placa, String modelo, String cor, Integer capacidadeMaxima) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeMaxima = capacidadeMaxima;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(Integer capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String toString() {
        return modelo + " " + cor + " placa " + placa;
    }
}
