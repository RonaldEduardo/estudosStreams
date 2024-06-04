import java.util.List;

public class ContarProdutos implements ProdutoService {
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
      return produtos;
    }

    public ContarProdutos(List<Produto> produtos) {
      this.produtos = produtos;
    }
    // Filtra os produtos com preço entre 30 e 100
    public int contarFaixaDePreco() {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= 30 && produto.getPreco() <= 100)
                .toList()
                .size();
    }


}
