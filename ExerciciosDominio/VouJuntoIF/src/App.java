import domain.*;

public class App {
    public static void main(String[] args) {

        Aluno joaoMotorista = new Aluno(1, "Joao Pedro", "2023001");
        Aluno mariazinha = new Aluno(2, "Maria Clara", "2023002");
        Aluno lucasST = new Aluno(3, "Lucas Silva", "2023003");
        Aluno aninha = new Aluno(4, "Ana Beatriz", "2023004");

        Veiculo onixPrata = new Veiculo(1, "ABC1D23", "Onix", "Prata", 4);


        Carona caronaPraShopping = new Carona(1, onixPrata, joaoMotorista, "IFTM Centro", "Shopping Uberlandia",
                "24/07/2026", "18:00", 3, SituacaoCaronaEnum.ABERTA);


        Solicitacao pedidoMaria = new Solicitacao(1, caronaPraShopping, mariazinha, "20/07/2026", SituacaoSolicitacaoEnum.ACEITA);

        Solicitacao pedidoLucas = new Solicitacao(2, caronaPraShopping, lucasST, "21/07/2026", SituacaoSolicitacaoEnum.PENDENTE);

        Solicitacao pedidoAna  = new Solicitacao(3, caronaPraShopping, aninha, "22/07/2026", SituacaoSolicitacaoEnum.RECUSADA);

        System.out.println(caronaPraShopping);
        System.out.println(pedidoMaria);
        System.out.println(pedidoLucas);
        System.out.println(pedidoAna);
    }
}
