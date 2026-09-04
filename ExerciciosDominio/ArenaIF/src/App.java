import domain.*;

public class App {
    public static void main(String[] args) {

        Aluno gabriel = new Aluno(1, "Gabriel Souza", "2023030");
        Aluno felipe = new Aluno(2, "Felipe Alves", "2023031");
        Aluno bruno = new Aluno(3, "Bruno Lima", "2023032");
        Aluno diego = new Aluno(4, "Diego Martins", "2023033");

        Campeonato campeonato = new Campeonato(1, "Copa IFTM de Free Fire", "Free Fire", "01/08/2026", "15/08/2026", 16, FormatoCompeticaoEnum.ELIMINATORIA_SIMPLES, SituacaoCampeonatoEnum.INSCRICOES_ENCERRADAS);

        Equipe timeA = new Equipe(1, "Time Foguete", gabriel);
        timeA.getJogadores().add(gabriel);
        timeA.getJogadores().add(felipe);

        Equipe timeB = new Equipe(2, "Time Trovao", bruno);
        timeB.getJogadores().add(bruno);
        timeB.getJogadores().add(diego);

        Inscricao i1 = new Inscricao(1, campeonato, gabriel, timeA);
        Inscricao i2 = new Inscricao(2, campeonato, felipe, timeA);
        Inscricao i3 = new Inscricao(3, campeonato, bruno, timeB);
        Inscricao i4 = new Inscricao(4, campeonato, diego, timeB);

        Partida partida = new Partida(1, campeonato, timeA, timeB, "02/08/2026", 1, 2, 1, SituacaoPartidaEnum.FINALIZADA);

        System.out.println(campeonato);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(partida);
    }
}
