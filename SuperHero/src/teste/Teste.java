package teste;

import controller.FatorCura;
import controller.SuperForca;
import controller.Voar;
import model.SuperHero;

/**
 * Created by Isabela on 26/06/2015.
 */
public class Teste {
    public static void main(String[] args) {

        /**
         * Instânciar Classe
         */
        SuperHero superman = new SuperHero();
        SuperHero hulk = new SuperHero();
        SuperHero wolverine = new SuperHero();

        /**
         * Super Man
         */
        superman.setNome("Clark Kent");
        superman.setPoder(new Voar());

        /**
         * Hulk
         */
        hulk.setNome("Robert Bruce Banner");
        hulk.setPoder(new SuperForca());

        /**
         * Wolverine
         */
        wolverine.setNome("James Logan Howlett");
        wolverine.setPoder(new FatorCura());


        /**
         * Realizando Poder
         */
        System.out.println("Nome Herói: " + superman.getNome());
        superman.realizarPoder();
        System.out.println("Nome Herói: " + hulk.getNome());
        hulk.realizarPoder();
        System.out.println("Nome Herói: " + wolverine.getNome());
        wolverine.realizarPoder();

        /**
         * Nesse Exemplo Instanciamos a Classe "SuperHero" para cada Herói e Definimos seu Poder,
         * mas Também é Possivel alterar de Forma Simples o tipo do Controlador, Basta Mudar o Conteúdo do Atributo "poder"
         * Exemplo:
         */
        superman.setPoder(new FatorCura());
        System.out.println("\nNome Herói: " + superman.getNome());
        superman.realizarPoder();
    }
}