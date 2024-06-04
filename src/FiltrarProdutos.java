import java.util.List;
import java.util.stream.Collectors;

//Classe que implementa a interface ProdutoService e realiza a filtragem de produtos.
class FiltrarProdutos implements ProdutoService {
  private final List<Produto> produtos;

  // Construtor da classe FiltrarProdutos.
  public FiltrarProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }
  // Obtém a lista de produtos.
  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }

  //Filtra os produtos com preço acima de 50.0.
  private List<Produto> filtrarProdutosMais50() {
    return produtos.stream()
        .filter(produto -> produto.getPreco() > 50.0)
        .collect(Collectors.toList());
  }

  //Lista os nomes dos produtos com preço acima de 50.0.
  public void listarProdutosAcimaDe50() {
    List<Produto> produtosFiltrados = filtrarProdutosMais50();

    System.out.println("Nomes dos produtos com preço acima de 50.0:");
    produtosFiltrados.stream()
        .map(Produto::getNome)
        .forEach(nome -> System.out.println(nome));
  }
}
