package abstraçãoDosObjetos;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private double preco;

    public Carro(String marca, String modelo, String cor, int anoFabricacao, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void ligar() {
        System.out.println("Ligando o carro...");
    }

    public void desligar() {
        System.out.println("Desligando o carro...");
    }

    public void acelerar() {
        System.out.println("Acelerando o carro...");
    }

    public void frear() {
        System.out.println("Freando o carro...");
    }

}
