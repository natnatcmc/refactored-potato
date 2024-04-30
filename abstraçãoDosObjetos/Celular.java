package abstraçãoDosObjetos;

public class Celular {
    private String marca;
    private String modelo;
    private String cor;
    private double preco;

    public Celular(String marca, String modelo, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    public void enviarMensagem(String mensagem, String numero) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void ligarFlash() {
        System.out.println("Ligando flash...");
    }
}