package Exercicio05Ingresso;

public class Ingresso {
    private String filme;
    private String genero;
    private String lugar;

    private String recomendação;
    private int duracao;


    public Ingresso(String filme, String genero, String lugar, String recomendação, int duracao) {
        super();
        this.filme = filme;
        this.genero = genero;
        this.lugar = lugar;
        this.recomendação = recomendação;
        this.duracao = duracao;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getRecomendação() {
        return recomendação;
    }

    public void setRecomendação(String recomendação) {
        this.recomendação = recomendação;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void visualizar(){
        System.out.println("Nome do filme: " + filme + " Genero: " + genero + " Assentos " + lugar + " Recomendação: " + recomendação + " Duração: " + duracao + " minutos");
    }
}
