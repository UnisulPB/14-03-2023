package dev.vini2003.aulas.d14m03y2023;

public class Main {
    public static void main(String[] args) {
        var carro = new CarroPasseio(1000, 200, 10000, "Vermelho", "Ferrari");
        var caminhao = new Caminhao(10000, 100, 100000, 1000, 100, 1000);

        System.out.println(carro.getCor());
        System.out.println(caminhao.getAlturaMaxima());
    }
}
