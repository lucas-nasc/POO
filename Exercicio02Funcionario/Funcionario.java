package Exercicio02Funcionario;

public class Funcionario {
    private String nome;
    private String sexo;
    private int idade;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String sexo, int idade, String cargo, double salario) {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void visualizar(){
        System.out.println("Funcionario: "+ nome + " Sexo: " + sexo + " Idade: "+ idade + " Cargo: " + cargo + " Salario: " + salario);
    }
}

