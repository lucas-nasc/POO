package Exercicio06Curso;

public class Curso {

    private String nomeCurso;
    private String tipo;

    private String nivel;
    private String plataforma;
    private int cargaHoraria;


    public Curso(String nomeCurso, String tipo, String nivel, String plataforma, int cargaHoraria) {
        this.nomeCurso = nomeCurso;
        this.tipo = tipo;
        this.nivel = nivel;
        this.plataforma = plataforma;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void visualizar(){
        System.out.println("Curso: " + nomeCurso + " Tipo do curso: " +tipo + " Nivel: " + nivel + " Plataforma " + plataforma + " Carga Horaria: " + cargaHoraria + " horas");
    }
}
