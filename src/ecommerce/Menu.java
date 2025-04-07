package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	//	private static ProdutoRepository repository = new ProdutoRepository();
	//	private static ProdutoRepository produtoRepository;
	//	private static Controller controller = new Controller(produtoRepository);

	//	produtoInfantil p1 = new produtoInfantil("Chinelo Infantil Cores", 79.90, 5);
	//	produtoInfantil p2 = new produtoInfantil("Sandalia Infantil Cores", 119.90, 3);
	//	repository.adicionarProduto(p1);
	//	repository.adicionarProduto(p2);

		int opcao;

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
				//controller.listarProdutos();
				break;

			case 2:
				System.out.println("\nListar Produtos  ");
			//	controller.adicionarProduto();
				break;

			case 3:
				System.out.println("\n Atualizar Produto ");
				//controller.removerProduto();
				break;

			case 4:
				System.out.println("\n Excluir Produto ");
				//controller.removerProduto();
				break;
			case 5:
				System.out.println("\n Buscar Produto ");
				//controller.removerProduto();
				break;
			
			default:
				System.out.println("\n Opção Inválida! Tente novamente. \n");
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

}
