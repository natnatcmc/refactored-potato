package abstraçãoDosObjetos;

public class Computador {
	   private String marca;
	    private String modelo;
	    private double preco;

	    // Construtor
	    public Computador(String marca, String modelo, double preco) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.preco = preco;
	    }

	    // Métodos getters e setters
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

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    // Outros métodos específicos do computador
	    public void ligar() {
	        System.out.println("Ligando...");
	    }

	    public void desligar() {
	        System.out.println("Desligando...");
	    }
}
