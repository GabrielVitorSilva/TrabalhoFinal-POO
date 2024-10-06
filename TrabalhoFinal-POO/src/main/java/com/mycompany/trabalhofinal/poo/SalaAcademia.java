package com.mycompany.trabalhofinal.poo;

public class SalaAcademia {
    private String nomeDaPratica;
    private int capacidadeSala;

    public SalaAcademia(String nomeDaPratica, int capacidadeSala) {
        this.nomeDaPratica = nomeDaPratica;
        this.capacidadeSala = capacidadeSala;
    }

    public String getNomeDaPratica() {
        return nomeDaPratica;
    }

    public void setNomeDaPratica(String nomeDaPratica) {
        this.nomeDaPratica = nomeDaPratica;
    }

    public int getCapacidadeSala() {
        return capacidadeSala;
    }

    public void setCapacidadeSala(int capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }
    @Override
    public String toString(){
    return "Sala para :" + nomeDaPratica + "pode conter até" + capacidadeSala;
    }
    
}
