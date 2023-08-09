package Exercicio06Curso;

public class CursoTeste {
    public static void main(String[] args) {
        Curso[] cursos = new Curso[2];

        cursos[0] = new Curso("T.I","Tecnologia","Avançado","EAD",500);
        cursos[1] =new Curso("Educação Fisica", "Saúde","Bacharelado","EAD",2000);

        for (Curso listar:cursos) {
            listar.visualizar();
        }
    }
}
