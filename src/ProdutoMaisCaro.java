import java.util.List;
import java.util.OptionalDouble;

public class ProdutoMaisCaro implements ProdutoService
{
  private final List<Produto> produtos;

  public ProdutoMaisCaro(List<Produto> produtos) {
    this.produtos = produtos;
  }

  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }
  // Filtra o produto mais caro
  public OptionalDouble FiltraProdutoMaisCaro() {
    return produtos.stream()
        .mapToDouble(Produto::getPreco)
        .max();
  }
}
