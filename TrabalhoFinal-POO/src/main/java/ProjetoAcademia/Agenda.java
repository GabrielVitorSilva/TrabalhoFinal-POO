package ProjetoAcademia;

public class Agenda {
    private String data;
    private boolean vagaDisponivel;

    public Agenda(String data, boolean vagaDisponivel) {
        this.data = data;
        this.vagaDisponivel = vagaDisponivel;
    }

    public boolean verificarVagas() {
        return vagaDisponivel;
    }

    public void realizarAgendamento() {
        if (vagaDisponivel) {
            System.out.println("Agendamento realizado para " + data);
            vagaDisponivel = false;
        } else {
            System.out.println("Sem vagas disponíveis para " + data);
        }
    }

    public void cancelarAgendamento(double valorAgendamento, String dataAula) {
        if (dataAulaMenorQueDoisDias(dataAula)) {
            System.out.println("50% do valor do agendamento foi retido. Valor retido: R$ " + valorAgendamento * 0.5);
        } else {
            System.out.println("Agendamento cancelado. Valor total devolvido.");
        }
        vagaDisponivel = true;
    }

    private boolean dataAulaMenorQueDoisDias(String dataAula) {
        // Implementar a lógica para comparar datas
        return true;
    }
}
