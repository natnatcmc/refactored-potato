package abstraçãoDosObjetos;

public class Mesa {
	   private String material;
	    private String cor;
	    private double largura;
	    private double comprimento;

	    // Construtor
	    public Mesa(String material, String cor, double largura, double comprimento) {
	        this.material = material;
	        this.cor = cor;
	        this.largura = largura;
	        this.comprimento = comprimento;
	    }

	    // Métodos getters e setters
	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public double getLargura() {
	        return largura;
	    }

	    public void setLargura(double largura) {
	        this.largura = largura;
	    }

	    public double getComprimento() {
	        return comprimento;
	    }

	    public void setComprimento(double comprimento) {
	        this.comprimento = comprimento;
	    }

	    // Outros métodos específicos da mesa
	    public void dobrar() {
	        System.out.println("Dobrando...");
	    }

	    public void montar() {
	        System.out.println("Montando...");
	    }
}
