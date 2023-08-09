package Exercicio03LojaGames;

public class LojaDeGames {

    private String nomeLoja;
    private String console;
    private String jogo;
    private String genero;
    private String midia;

    public LojaDeGames(String nomeLoja, String console, String jogo, String genero, String midia) {
        super();
        this.nomeLoja = nomeLoja;
        this.console = console;
        this.jogo = jogo;
        this.genero = genero;
        this.midia = midia;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public void visualizar(){
        System.out.println("Nome da loja: " + nomeLoja + " Console que deseja: " + console + " Jogo que deseja: " + jogo + " Genero do jogo: " + genero + " Midia do jogo: " + midia);
    }
}
