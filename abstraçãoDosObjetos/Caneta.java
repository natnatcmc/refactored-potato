package abstraçãoDosObjetos;

public class Caneta {
	   private String cor;
	    private String marca;
	    private double preco;

	    // Construtor
	    public Caneta(String cor, String marca, double preco) {
	        this.cor = cor;
	        this.marca = marca;
	        this.preco = preco;
	    }

	    // Métodos getters e setters
	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    // Outros métodos específicos da caneta
	    public void escrever() {
	        System.out.println("Escrevendo...");
	    }

	    public void recarregar() {
	        System.out.println("Recarregando...");
	    }
}
