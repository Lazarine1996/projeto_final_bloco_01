package ecommerce.controller;

import java.util.ArrayList;
import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;
import ecommerce.util.Cores;

public class ProdutoController implements ProdutoRepository {
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("Produto de Numero: " + produto.getNumero());
		System.out.println("Cadastrado com Sucesso");
	}

	@Override
	public void listarProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void buscarProduto(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println(Cores.TEXT_RED_BOLD + "\nO produto de numero: " + numero + " não foi encontrado!"
					+ Cores.TEXT_RESET);

	}

	@Override
	public void atualizarProduto(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getNumero());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println(Cores.TEXT_GREEN_BOLD + "\nO produto de numero: " + produto.getNumero()
					+ " foi atualizada com sucesso!" + Cores.TEXT_RESET);
		}

		else
			System.out.println(Cores.TEXT_RED_BOLD + "\nO produto de numero: " + produto.getNumero()
					+ " não foi encontrado!" + Cores.TEXT_RESET);

	}

	@Override
	public void removerProduto(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			listaProdutos.remove(produto);
			System.out.println(Cores.TEXT_GREEN_BOLD + "\nO produto de numero: " + produto.getNumero()
					+ " foi removido com sucesso!" + Cores.TEXT_RESET);
		} else
			System.out.println(Cores.TEXT_RED_BOLD + "\nO produto de numero: " + numero + " não foi encontrado!"
					+ Cores.TEXT_RESET);

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}
		return null;

	}
}
