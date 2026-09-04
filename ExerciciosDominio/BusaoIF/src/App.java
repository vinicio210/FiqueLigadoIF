import domain.*;

public class App {
    public static void main(String[] args) {

        Estudante rafa = new Estudante(1, "Rafaela Costa", "12345678900", "2023020",
                "Desenvolvimento de Sistemas", "Rua das Flores, 123 - Uberlandia", "Noturno");


        LinhaOnibus linha052 = new LinhaOnibus(1, "052", "Centro / IFTM", "Viacao Uberlandia",
                "Centro", "IFTM Campus Uberlandia Centro");

        SolicitacaoPasse solicitacaoDaRafa = new SolicitacaoPasse(1, rafa, linha052, SituacaoSolicitacaoPasseEnum.EM_ANALISE);

        Documento comprovanteMatricula = new Documento(1, "Comprovante de matricula", "20/07/2026", SituacaoDocumentoEnum.APROVADO);
        Documento docRG = new Documento(2, "RG", "20/07/2026", SituacaoDocumentoEnum.APROVADO);

        solicitacaoDaRafa.getDocumentos().add(comprovanteMatricula);
        solicitacaoDaRafa.getDocumentos().add(docRG);


        PasseEscolar passeDaRafa = new PasseEscolar(1, "PASSE-0001", "25/07/2026", "25/12/2026", SituacaoPasseEnum.ATIVO, solicitacaoDaRafa);

        System.out.println(rafa);
        System.out.println(linha052);
        System.out.println(solicitacaoDaRafa);
        System.out.println(passeDaRafa);
    }
}
