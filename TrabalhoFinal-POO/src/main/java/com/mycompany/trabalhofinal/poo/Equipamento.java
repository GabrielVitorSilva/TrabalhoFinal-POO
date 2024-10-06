

package com.mycompany.trabalhofinal.poo;


public class Equipamento {
  private String id;
  private String nome;
  private boolean manutencaoPendente;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isManutençãoPendente() {
        return manutencaoPendente;
    }

    public void setManutençãoPendente(boolean manutencaoPendente) {
        this.manutencaoPendente = manutencaoPendente;
    }

    public Equipamento(String id, String nome, boolean manutencaoPendente) {
        this.id = id;
        this.nome = nome;
        this.manutencaoPendente = manutencaoPendente;
    }
    
   public void atualizarStatus(){
       System.out.println("alterar implementação");
   }
@Override
       
    public String toString(){
    return "Equipamento[tipo: " + id + ", " + nome + "," + manutencaoPendente + " ] ";
    }
}
