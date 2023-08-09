package Exercicio04Farmacia;

public class TesteFarmacia {
    public static void main(String[] args) {

        Farmacia[] farmacia = new Farmacia[2];

        farmacia[0] =new Farmacia("Drogaria do Josè","Rua do piolho n°123","Remedio","Diporona",30);
        farmacia[1] = new Farmacia("Drogaria Vitao","Virginia Ferni 145","Higiene","Shampoo",500);

        for (Farmacia roda:farmacia) {
            roda.visualizar();
        }

    }
}
