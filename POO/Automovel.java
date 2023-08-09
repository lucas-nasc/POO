package POO;

public class Automovel {
    //Declaração dos atributos da classes

    private String nomeProprietario;
    private String modelo;
    private String placa;
    private int ano;

    // Criar o metodo construtor



    public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
        //super(); indica que estou criando o construtor da super class
        super();
        this.nomeProprietario = nomeProprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;

    }

    //Declaração de metodos get e set

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Declaração de metodos especificos

    public void imprimirInfor(){
        System.out.println("\n" + nomeProprietario +" possui um(a) " + modelo+ " com placa: "+placa+
        " e ano " + ano);
    }

}
