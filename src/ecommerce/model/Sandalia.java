package ecommerce.model;

public class Sandalia extends Produto {
	private float peso;

	public Sandalia(String nome, double preco, int numero, int tipo, float peso) {
		super(nome, preco, numero, tipo);
		this.peso = peso ;

	}

	public float getPeso() {
		return this.peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Peso: " + getPeso());
	}
}