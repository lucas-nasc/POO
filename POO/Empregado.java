package POO;

import java.text.NumberFormat;

public class Empregado {

    //Declarando os atributos da classe
    private String nome;
    private double salario;

    //Declaração do construtor da classe
    public Empregado(String nome, double salario) {
        super();
        this.nome = nome;
        this.salario = salario;
    }

    //Declaração dos get e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Void sem retorno Declarando os metodos especificos da classe
    public void aumentarSalario(double percentual){

        salario *= 1+ percentual/100;

    }
    // se não tiver void tem que retornar algo
    public String formatarMoeda(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();// pega o moeda do pais
        nf.setMinimumFractionDigits(2); // Quantidade de virgulas depois da virgula indica que ira ter 2 casa depois da virgula
        String fomatoMoeda = nf.format(salario);// formata o salario
        return fomatoMoeda; // retorna o salario formatado
    }

    public void imprimir(){
        System.out.println(nome + " "+ "Salario: " + this.formatarMoeda());
    }


}
