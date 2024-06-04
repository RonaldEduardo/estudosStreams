import java.util.List;
import java.util.stream.Collectors;


//Classe que implementa a interface ProdutoService e representa uma lista de produtos a serem concatenados.
public class ConcatenarProdutos implements ProdutoService {
  private final List<Produto> produtos;

  // Construtor que recebe uma lista de produtos.
  public ConcatenarProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  // Obtém a lista de produtos.
  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }

  // Concatena os nomes de todos os produtos usando uma vírgula como separador.
  public String concatenarNomes() {
    return produtos.stream()
        .map(Produto::getNome)
        .collect(Collectors.joining(", "));
  }
}
