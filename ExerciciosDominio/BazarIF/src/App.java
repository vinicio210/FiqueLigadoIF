import domain.*;

public class App {
    public static void main(String[] args) {

        Aluno carlinha = new Aluno(1, "Carla Menezes", "2023040");
        Aluno tiagoTR = new Aluno(2, "Tiago Rezende", "2023041");
        Aluno paulinha = new Aluno(3, "Paula Nogueira", "2023042");


        Campanha bazarFormatura = new Campanha(1, "Bazar da Formatura", "Venda de camisetas e doces",
                "Arrecadar dinheiro para a formatura do 3 ano", "01/08/2026", "30/08/2026", 3000.0, carlinha, TipoCampanhaEnum.CAMISETAS);

        Produto camisetaFormatura = new Produto(1, "Camiseta de formatura", "Camiseta branca estampada", 45.0, 50, "Vestuario");
        Produto caixaBrigadeiro = new Produto(2, "Caixa de brigadeiro", "Caixa com 6 unidades", 10.0, 30, "Doces");


        Venda venda1 = new Venda(1, bazarFormatura, carlinha, tiagoTR, "05/08/2026", FormaPagamentoEnum.PIX, SituacaoVendaEnum.PAGA);
        ItemVenda itemCamiseta = new ItemVenda(1, venda1, camisetaFormatura, 1, 45.0);
        venda1.getItens().add(itemCamiseta);

        Venda venda2 = new Venda(2, bazarFormatura, carlinha, paulinha, "06/08/2026", FormaPagamentoEnum.DINHEIRO, SituacaoVendaEnum.ENTREGUE);
        ItemVenda itemBrigadeiro = new ItemVenda(2, venda2, caixaBrigadeiro, 2, 10.0);
        venda2.getItens().add(itemBrigadeiro);


        NumeroRifa numeroDoTiago = new NumeroRifa(1, bazarFormatura, 5.0, tiagoTR, SituacaoNumeroRifaEnum.PAGO);
        NumeroRifa numeroLivre = new NumeroRifa(2, bazarFormatura, 5.0, null, SituacaoNumeroRifaEnum.DISPONIVEL);

        System.out.println(bazarFormatura);
        System.out.println(camisetaFormatura);
        System.out.println(caixaBrigadeiro);
        System.out.println(venda1);
        System.out.println(itemCamiseta);
        System.out.println(venda2);
        System.out.println(itemBrigadeiro);
        System.out.println(numeroDoTiago);
        System.out.println(numeroLivre);
    }
}
