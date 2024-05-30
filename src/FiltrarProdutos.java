import java.util.List;
import java.util.stream.Collectors;

class FiltrarProdutos{

  private List<Produto> produtos;

  public FiltrarProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  public List<Produto> listarProdutosAcimaDe50(List<Produto> produtos) {
    List<Produto> produtos50Mais = filtrarProdutosAcimaDe50(produtos);
    return produtos50Mais;
  }

  private List<Produto> filtrarProdutosAcimaDe50(List<Produto> produtos) {
    return produtos.stream()
        .filter(produto -> produto.getPreco() > 50.0)
        .collect(Collectors.toList());
  }


}
