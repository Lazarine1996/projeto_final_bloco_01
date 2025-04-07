package ecommerce.model;

public class Chinelo extends Produto {
	private int tamanho;

	public Chinelo(String nome, double preco, int numero, int tipo, int tamanho) {
		super(nome, preco, numero, tipo);
		this.tamanho = tamanho;

	}

	public int getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho: " + getTamanho());
	}
}
