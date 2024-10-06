
package ProjetoAcademia;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Agendamento {
    private String descricao;
    private LocalDate dataAgendada;
    private boolean cancelado;
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(LocalDate dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public Agendamento(String descricao, LocalDate dataAgendada) {
        this.descricao = descricao;
        this.dataAgendada = dataAgendada;
        this.cancelado = false;
    }
    public void cancelAgendamentoRetendoValor(){
        this.cancelado = true;
        System.out.println("Agendamento"+ descricao + "foi cancelado.");
    }
    
     public void verificarCancelamentoAutomatico() {
        LocalDate hoje = LocalDate.now();
        long diasAteAgendamento = ChronoUnit.DAYS.between(hoje, dataAgendada);

        if (diasAteAgendamento <= 2) {
            cancelAgendamentoRetendoValor();
        }
 
    }
   
}