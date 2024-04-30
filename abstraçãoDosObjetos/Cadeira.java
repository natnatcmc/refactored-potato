package abstraçãoDosObjetos;

public class Cadeira {
	 private String material;
	    private String cor;
	    private boolean giratoria;

	    // Construtor
	    public Cadeira(String material, String cor, boolean giratoria) {
	        this.material = material;
	        this.cor = cor;
	        this.giratoria = giratoria;
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

	    public boolean isGiratoria() {
	        return giratoria;
	    }

	    public void setGiratoria(boolean giratoria) {
	        this.giratoria = giratoria;
	    }

	    // Outros métodos específicos da cadeira
	    public void ajustarAltura() {
	        System.out.println("Ajustando altura...");
	    }

	    public void reclinar() {
	        System.out.println("Reclinando...");
	    }
}
