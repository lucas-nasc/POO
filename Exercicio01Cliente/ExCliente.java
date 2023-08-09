package Exercicio01Cliente;

public class ExCliente {

    private String nome;
    private String sexo;
    private int idade;
    private double saldo;
    private String email;

    public ExCliente(String nome, String sexo, int idade, double saldo, String email) {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saldo = saldo;
        this.email = email;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void visualizar(){
        System.out.println("Cliente "+nome + " sexo: " + sexo + " idade: " + idade + " Seu saldo é de: " + saldo + " Email: " + email);
    }

}
