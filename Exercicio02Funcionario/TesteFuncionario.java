package Exercicio02Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Lucas Nascimento Silva","Masculino",22,"Engenheiro de Software",50000);
        Funcionario funcionario2 = new Funcionario("Lohan Nascimento Silva","Masculino",18,"Desenvolvedor web",80000);

        funcionario1.visualizar();
        funcionario2.visualizar();
    }




}
