import java.util.List;

public class SomarProdutos implements ProdutoService {
  private final List<Produto> produtos;

  public SomarProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }

  public double somarPrecos() {
    return produtos.stream()
        .mapToDouble(Produto::getPreco)
        .sum();
  }

}
