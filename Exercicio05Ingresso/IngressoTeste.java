package Exercicio05Ingresso;

public class IngressoTeste {
    public static void main(String[] args) {

        Ingresso[] ingressos = new Ingresso[2];

        ingressos[0] = new Ingresso("Rango ","Faroeste","5G","Infantil",110);
        ingressos[1] = new Ingresso("Django livre","Faroeste","8G","+18",170);

        for (Ingresso lista:ingressos) {
            lista.visualizar();

        }
    }
}
