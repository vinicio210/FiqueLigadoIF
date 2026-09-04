package domain;

import java.util.ArrayList;
import java.util.List;

public class SolicitacaoPasse {

    private Integer id;
    private Estudante estudante;
    private LinhaOnibus linhaOnibus;
    private SituacaoSolicitacaoPasseEnum situacao;

    private List<Documento> documentos = new ArrayList<>();

    public SolicitacaoPasse() {
    }


    public SolicitacaoPasse(Integer id, Estudante estudante, LinhaOnibus linhaOnibus,
                             SituacaoSolicitacaoPasseEnum situacao) {
        this.id = id;
        this.estudante = estudante;
        this.linhaOnibus = linhaOnibus;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public LinhaOnibus getLinhaOnibus() {
        return linhaOnibus;
    }


    public void setLinhaOnibus(LinhaOnibus linhaOnibus) {
        this.linhaOnibus = linhaOnibus;
    }

    public SituacaoSolicitacaoPasseEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoSolicitacaoPasseEnum situacao) {
        this.situacao = situacao;
    }


    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public String toString() {
        return "Solicitacao de " + estudante.getNome() + " para linha " + linhaOnibus.getNumero()
                + " - situacao: " + situacao + " - documentos: " + documentos.size();
    }
}
