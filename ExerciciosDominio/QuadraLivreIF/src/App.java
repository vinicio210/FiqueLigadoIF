import domain.*;

public class App {
    public static void main(String[] args) {

        Aluno pedro = new Aluno(1, "Pedro Henrique", "2023010");
        Aluno julia = new Aluno(2, "Julia Fernandes", "2023011");

        Quadra quadra1 = new Quadra(1, "Quadra Poliesportiva 1", "Bloco A", "Cimento");
        quadra1.getModalidadesPermitidas().add(ModalidadeEnum.FUTSAL);
        quadra1.getModalidadesPermitidas().add(ModalidadeEnum.HANDEBOL);

        Quadra quadra2 = new Quadra(2, "Quadra de Areia", "Fundos do bloco B", "Areia");
        quadra2.getModalidadesPermitidas().add(ModalidadeEnum.VOLEI);
        quadra2.getModalidadesPermitidas().add(ModalidadeEnum.PETECA);

        Agendamento ag1 = new Agendamento(1, quadra1, ModalidadeEnum.FUTSAL, "24/07/2026", "14:00", "15:00", SituacaoAgendamentoEnum.CONFIRMADO);
        Agendamento ag2 = new Agendamento(2, quadra2, ModalidadeEnum.VOLEI, "25/07/2026", "16:00", "17:00", SituacaoAgendamentoEnum.SOLICITADO);

        ParticipacaoAgendamento p1 = new ParticipacaoAgendamento(1, ag1, pedro);
        ParticipacaoAgendamento p2 = new ParticipacaoAgendamento(2, ag1, julia);

        System.out.println(quadra1);
        System.out.println(quadra2);
        System.out.println(ag1);
        System.out.println(ag2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
