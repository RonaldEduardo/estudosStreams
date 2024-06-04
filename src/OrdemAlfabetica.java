import java.util.List;
import java.util.stream.Collectors;

public class OrdemAlfabetica implements ProdutoService {
  private final List<Produto> produtos;

  public OrdemAlfabetica(List<Produto> produtos) {
    this.produtos = produtos;
  }

  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }

  private List<Produto> ordemAlfabetica() {
    return getProdutos().stream()
        .sorted((produto1, produto2) -> produto1.getNome().compareTo(produto2.getNome()))
        .collect(Collectors.toList());
  }

  public void listarProdutosOrdemAlfabetica() {
    List<Produto> produtosOrdenados = ordemAlfabetica();

    System.out.println("Nomes dos produtos em ordem alfabética:");
    produtosOrdenados.stream()
        .map(Produto::getNome)
        .forEach(nome -> System.out.println(nome));
  }
}
