package Exercicio03LojaGames;

import POO.Empregado;

public class LojaDeGamesTeste {

    public static void main(String[] args) {
        LojaDeGames [] lista = new LojaDeGames[2];

        lista[0] = new LojaDeGames("Mario games","Ps4","God of war","Aventura","Digital");
        lista[1] = new LojaDeGames("Lucas games","Xbox","Pes 2022", "Esporte","Fisica");

        for (LojaDeGames roda:lista) {
            roda.visualizar();

        }
    }

}
