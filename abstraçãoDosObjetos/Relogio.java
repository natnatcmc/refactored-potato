package abstraçãoDosObjetos;

public class Relogio {
	  private String marca;
	    private String estilo;
	    private boolean digital;

	    // Construtor
	    public Relogio(String marca, String estilo, boolean digital) {
	        this.marca = marca;
	        this.estilo = estilo;
	        this.digital = digital;
	    }

	    // Métodos getters e setters
	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getEstilo() {
	        return estilo;
	    }

	    public void setEstilo(String estilo) {
	        this.estilo = estilo;
	    }

	    public boolean isDigital() {
	        return digital;
	    }

	    public void setDigital(boolean digital) {
	        this.digital = digital;
	    }

	    // Outros métodos específicos do relógio
	    public void ajustarHora() {
	        System.out.println("Ajustando hora...");
	    }

	    public void mostrarData() {
	        System.out.println("Mostrando data...");
	    }
}
