package controller;

/**
 * Created by Isabela on 26/06/2015.
 */
public class SuperForca implements Poder {
    /**Dentro da Classe que implementa o Comtrolador de "Comportamento" você Sobreescreve o Método, Adicionando suas Diferenças de Comportamento.
     * Nesse Exemplo Usaremos Apenas uma Saída de Texto para Exemplificar o Padrão de Projeto - Strategy.
     */
    @Override
    public void poder() {
        System.out.println("Super Força...");
    }
}
