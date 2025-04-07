package ecommerce.model;

import ecommerce.util.Cores;

public abstract class Produto {
	private String nome;
	private double preco;
	private int numero;
	private int tipo;

	public Produto(String nome, double preco, int numero, int tipo) {
		this.nome = nome;
		this.preco = preco;
		this.numero = numero;
		this.tipo = tipo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar () {
		String tipo = "";

        switch (this.tipo) {
            case 1:
                tipo = "Chinelo Infantil Cores";
                break;
            case 2:
                tipo = "Sandalia Infantil Cores";
                break;
        }

        System.out.println(Cores.TEXT_RED
                + "\n\n***********************************************************"
                + Cores.TEXT_RESET);
        System.out.println("Dados do Produto:");
        System.out.println(Cores.TEXT_RED
                + "***********************************************************"
                + Cores.TEXT_RESET);
        System.out.println("Numero do produto: " + getNumero());
        System.out.println("Nome do produto: " + getNome());
        System.out.printf("Preço do produto: R$ %.2f\n", getPreco());
        System.out.println("Tipo do produto: " + tipo);
	}

}
