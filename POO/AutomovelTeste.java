package POO;

public class AutomovelTeste {
    public static void main(String[] args) {

        //Instanciando um objeto da classe
        Automovel auto1 = new Automovel("clesio","Honda Civic", "PDF123",2023);

        auto1.imprimirInfor();

        auto1.setNomeProprietario("Stefani Manini");
        auto1.setPlaca("STE1A74");

        auto1.imprimirInfor();



    }
}
