package model;

import controller.Poder;

/**
 * Created by Isabela on 26/06/2015.
 */
public class SuperHero {

    /**Variáveis de Instância
     * É Necesário Criar uma Variável do Tipo do Controlador, pois é Nela que Iremos "Setar" qual é o Tipo de Controlador que Vamos Utilizar.
     */
    private String nome;
    private Poder poder;

    /**
     * Getters e Setters
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    /**Método do Padrão Strategy
     * É Necessário Criar um Método para "chamar" o Método do Controlador - poder() -
     * Basicamente Esse Método Chama o Método - poder() - Independente do Tipo de Poder do Personagem.
     */
    public void realizarPoder() {
        poder.poder();
    }
}