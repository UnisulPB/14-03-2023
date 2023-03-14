package dev.vini2003.aulas.d14m03y2023;

class Veiculo {
    private int peso;
    private int velocidadeMaxima;
    private float preco;

    public Veiculo(int peso, int velocidadeMaxima, float preco) {
        this.peso = peso;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}

class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio(int peso, int velocidadeMaxima, float preco, String cor, String modelo) {
        super(peso, velocidadeMaxima, preco);

        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

class Caminhao extends Veiculo {
    private int cargaMaxima;
    private int alturaMaxima;
    private int comprimento;

    public Caminhao(int peso, int velocidadeMaxima, float preco, int cargaMaxima, int alturaMaxima, int comprimento) {
        super(peso, velocidadeMaxima, preco);

        this.cargaMaxima = cargaMaxima;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
}

public class D14M03Y2023 {
    public static void main(String[] args) {
        var carro = new CarroPasseio(1000, 200, 10000, "Vermelho", "Ferrari");
        var caminhao = new Caminhao(10000, 100, 100000, 1000, 100, 1000);

        System.out.println(carro.getCor());
        System.out.println(caminhao.getAlturaMaxima());
    }
}
