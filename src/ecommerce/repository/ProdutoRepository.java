package ecommerce.repository;

import ecommerce.model.Produto;

public interface ProdutoRepository {

	public void cadastrarProduto(Produto produto);

    public void listarProdutos();

    public void buscarProduto(int numero);

    public void atualizarProduto(Produto produto);

    public void removerProduto(int numero);

}
