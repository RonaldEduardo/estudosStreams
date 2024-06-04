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
  //Pega os preços dos produtos e soma todos eles
  public double somarPrecos() {
    return produtos.stream()
        .mapToDouble(Produto::getPreco)
        .sum();
  }

}
