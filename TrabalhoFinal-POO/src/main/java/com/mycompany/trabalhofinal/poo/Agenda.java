package com.mycompany.trabalhofinal.poo;

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

    public void cancelarAgendamento() {
        vagaDisponivel = true;
        System.out.println("Agendamento .");
    }
}
