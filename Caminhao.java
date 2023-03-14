package dev.vini2003.aulas.d14m03y2023;

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
