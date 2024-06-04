import java.util.List;

public class SomarProdutos {
  private List<Produto> produtos;

  public SomarProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }
  public double somarPrecos() {
    return produtos.stream()
        .mapToDouble(Produto::getPreco)
        .sum();
  }

}
