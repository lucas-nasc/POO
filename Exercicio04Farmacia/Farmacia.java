package Exercicio04Farmacia;

public class Farmacia {

    private String nomeFarmacia;
    private String endereco;
    private String tipoProduto;
    private String Produto;
    private int ml;


    public Farmacia(String nomeFarmacia, String endereco, String tipoProduto, String produto, int ml) {
        this.nomeFarmacia = nomeFarmacia;
        this.endereco = endereco;
        this.tipoProduto = tipoProduto;
        Produto = produto;
        this.ml = ml;
    }

    public String getNomeFarmacia() {
        return nomeFarmacia;
    }

    public void setNomeFarmacia(String nomeFarmacia) {
        this.nomeFarmacia = nomeFarmacia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public void visualizar(){
        System.out.println("Farmacia: " + nomeFarmacia + " Endereço: " + endereco + " Tipo do produto: " + tipoProduto + " Produto: " + Produto + " Ml: " + ml );
    }
}
