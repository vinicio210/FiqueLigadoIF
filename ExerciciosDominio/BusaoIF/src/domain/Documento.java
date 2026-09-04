package domain;

public class Documento {

    private Integer id;
    private String nome;
    private String dataEnvio;
    private SituacaoDocumentoEnum situacao;

    public Documento() {
    }

    public Documento(Integer id, String nome, String dataEnvio, SituacaoDocumentoEnum situacao) {
        this.id = id;
        this.nome = nome;
        this.dataEnvio = dataEnvio;
        this.situacao = situacao;
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

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }


    public SituacaoDocumentoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoDocumentoEnum situacao) {
        this.situacao = situacao;
    }


    public String toString() {
        return nome + " enviado em " + dataEnvio + " - " + situacao;
    }
}
