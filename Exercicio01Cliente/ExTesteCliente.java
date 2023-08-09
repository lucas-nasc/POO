package Exercicio01Cliente;

public class ExTesteCliente {
    public static void main(String[] args) {

        ExCliente cliente1 = new ExCliente("Lucas Nascimento","Masculino",22,5000,"lcsnascimento91@gmail.com");
        ExCliente cliente2 = new ExCliente("Lohan Nascimento","Masculino",18,8000,"lohan.nascimento@gmail.com");

        cliente1.visualizar();
        cliente2.visualizar();


    }
}
