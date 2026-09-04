package domain;

public class Carona {

    private Integer id;
    private Veiculo veiculo;
    private Aluno motorista;
    private String localSaida;
    private String destino;
    private String data;
    private String horario;
    private Integer vagasDisponiveis;
    private SituacaoCaronaEnum situacao;

    public Carona() {
    }

    public Carona(Integer id, Veiculo veiculo, Aluno motorista, String localSaida, String destino,
                  String data, String horario, Integer vagasDisponiveis, SituacaoCaronaEnum situacao) {
        this.id = id;
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.localSaida = localSaida;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.vagasDisponiveis = vagasDisponiveis;
        this.situacao = situacao;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Aluno getMotorista() {
        return motorista;
    }

    public void setMotorista(Aluno motorista) {
        this.motorista = motorista;
    }

    public String getLocalSaida() {
        return localSaida;
    }


    public void setLocalSaida(String localSaida) {
        this.localSaida = localSaida;
    }

    public String getDestino() {
        return destino;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public String getHorario() {
        return horario;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getVagasDisponiveis() {
        return vagasDisponiveis;
    }


    public void setVagasDisponiveis(Integer vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public SituacaoCaronaEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoCaronaEnum situacao) {
        this.situacao = situacao;
    }

    public String toString() {
        return "Carona de " + motorista.getNome() + " (" + veiculo.getModelo() + ") saindo de "
                + localSaida + " para " + destino + " em " + data + " as " + horario
                + " - vagas: " + vagasDisponiveis + " - situacao: " + situacao;
    }
}
