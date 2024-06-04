import java.util.List;

public class ContarProdutos implements ProdutoService {
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
      return produtos;
    }

    public ContarProdutos(List<Produto> produtos) {
      this.produtos = produtos;
    }

    public int contarFaixaDePreco() {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= 30 && produto.getPreco() <= 100)
                .toList()
                .size();
    }


}
