
package com.mycompany.trabalhofinal.poo;
import java.time.LocalDate;



public class ServicoAgendamento {

    // Método para agendar
    public Agendamento agendar(String descricao, LocalDate data) {
        Agendamento agendamento = new Agendamento(descricao, data);
        System.out.println("Agendamento criado para: " + agendamento.getDataAgendada());
        return agendamento;
    }

    // Método para verificar e cancelar agendamentos que estão próximos (dois dias antes)
    public void verificarECancelarAgendamento(Agendamento agendamento) {
        agendamento.verificarCancelamentoAutomatico();
    }
}
