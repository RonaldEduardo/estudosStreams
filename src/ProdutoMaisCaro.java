import java.util.List;
import java.util.OptionalDouble;

public class ProdutoMaisCaro {
  private final List<Produto> produtos;

  public ProdutoMaisCaro(List<Produto> produtos) {
    this.produtos = produtos;
  }

  public OptionalDouble FiltraProdutoMaisCaro() {
    return produtos.stream()
        .mapToDouble(Produto::getPreco)
        .max();
  }
}
