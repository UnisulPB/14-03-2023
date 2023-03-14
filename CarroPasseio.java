package dev.vini2003.aulas.d14m03y2023;

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
