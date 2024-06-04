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

  private List<Produto> filtrarProdutosMais50() {
    return produtos.stream()
        .filter(produto -> produto.getPreco() > 50.0)
        .collect(Collectors.toList());
  }

  public void listarProdutosAcimaDe50() {
    List<Produto> produtosFiltrados = filtrarProdutosMais50();

    System.out.println("Nomes dos produtos com preço acima de 50.0:");
    produtosFiltrados.stream()
        .map(Produto::getNome)
        .forEach(nome -> System.out.println(nome));
  }


}
