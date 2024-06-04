import java.util.List;
import java.util.stream.Collectors;

class FiltrarProdutos implements ProdutoService
{
  private final List<Produto> produtos;

  public FiltrarProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }

  public List<Produto> listarProdutosAcimaDe50() {
    return produtos.stream()
        .filter(produto -> produto.getPreco() > 50.0)
        .collect(Collectors.toList());
  }
}
