package ecommerce;

import java.io.IOException;
import java.util.Scanner;
import ecommerce.controller.ProdutoController;
import ecommerce.model.Chinelo;
import ecommerce.model.Sandalia;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ProdutoController produtos = new ProdutoController();

		int opcao, numero = 0, tipo, tamanho;
		float peso, preco;
		String nome;
		produtos.cadastrarProduto(new Chinelo(produtos.gerarNumero(), "Chinelo", 79.90, 1, 35));
		while (true) {

			System.out.println("***************************************************");
			System.out.println("                                                    ");
			System.out.println("             LUA SAPATOS INFANTIL                   ");
			System.out.println("                                                    ");
			System.out.println("**************************************************\n");
			System.out.println("                                                    ");
			System.out.println("         1 - Cadastrar Produtos                     ");
			System.out.println("         2 - Listar Produtos                        ");
			System.out.println("         3 - Atualizar Produto                      ");
			System.out.println("         4 - Excluir Produto                        ");
			System.out.println("         5 - Buscar Produto                         ");
			System.out.println("         6 - Sair                                   ");
			System.out.println("**************************************************\n");
			System.out.println("              ESCOLHA A OPÇÃO DESEJADA              ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\n LUA SAPATOS INFANTIL AGRADECE ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("\n Cadastrar Produtos   ");
				System.out.println("\n Digite o Nome do Produto ");
				leia.next();
				nome = leia.nextLine();
				System.out.println("\n Digite o Preço do Produto ");
				preco = leia.nextFloat();

				do {
					System.out.println("\n Digite o Tipo do Produto (1-Chinelo) (2-Sandalia)  ");
					tipo = leia.nextInt();
				} while (tipo < 1 || tipo > 2);
				switch (tipo) {
				case 1 -> {
					System.out.println("\n Digite o Tamanho do Produto ");
					tamanho = leia.nextInt();
					produtos.cadastrarProduto(new Chinelo(produtos.gerarNumero(), nome, preco, tipo, tamanho));
				}
				case 2 -> {
					System.out.println("\n Digite o Peso do Produto ");
					peso = leia.nextInt();
					produtos.cadastrarProduto(new Sandalia(produtos.gerarNumero(), nome, preco, tipo, peso));
				}
				default -> {
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				}
				}
				keyPress();
				break;

			case 2:
				System.out.println("\nListar Produtos  ");
				produtos.listarProdutos();
				keyPress();
				break;

			case 3:
				System.out.println("\n Atualizar Produto ");
				System.out.println("\n Digite o numero do produto: ");
				numero = leia.nextInt();
				var buscaProduto = produtos.buscarNaCollection(numero);

				if (buscaProduto != null) {
					System.out.println("\n Digite o Nome do Produto ");
					leia.next();
					nome = leia.nextLine();
					System.out.println("\n Digite o Preço do Produto ");
					preco = leia.nextFloat();

					switch (buscaProduto.getTipo()) {
					case 1 -> {
						System.out.println("\n Digite o Tamanho do Produto ");
						tamanho = leia.nextInt();
						produtos.atualizarProduto(new Chinelo(numero, nome, preco, buscaProduto.getTipo(), tamanho));
					}
					case 2 -> {
						System.out.println("\n Digite o Peso do Produto ");
						peso = leia.nextInt();
						produtos.atualizarProduto(new Sandalia(numero, nome, preco, buscaProduto.getTipo(), peso));
					}
					default -> {
						System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
					}
					}
				}

				else
					System.out.println(Cores.TEXT_RED_BOLD + "\nO produto de numero: " + numero + " não foi encontrado!"
							+ Cores.TEXT_RESET);

				keyPress();
				break;

			case 4:
				System.out.println("\n Excluir Produto ");
				System.out.println("\n Digite o numero do produto: ");
				numero = leia.nextInt();
				produtos.removerProduto(numero);
				keyPress();
				break;

			case 5:
				System.out.println("\n Buscar Produto ");
				System.out.println("\n Digite o Numero do Produto ");
				numero = leia.nextInt();
				produtos.buscarProduto(numero);
				keyPress();
				break;

			default:
				System.out.println("\n Opção Inválida! Tente novamente. \n");
				keyPress();
				break;

			}
		}
	}

	public static void sobre() {
		System.out.println(" \n*****************************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Luan Lazarine - luanl@genstudents.org");
		System.out.println("https://github.com/Lazarine1996");
		System.out.println("*****************************************************************");

	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
