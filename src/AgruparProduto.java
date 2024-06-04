import java.util.List;

public class AgruparProduto implements ProdutoService{
  private final List<Produto> produtos;

  public AgruparProduto(List<Produto> produtos) {
    this.produtos = produtos;
  }

  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }

  private List<Produto> agruparPorPrecoAte50() {
    return produtos.stream()
        .filter(produto -> produto.getPreco() <= 50)
        .toList();
  }

  public void listarProdutosAte50() {
    List<Produto> produtosAgrupados = agruparPorPrecoAte50();

    System.out.println("Nomes dos produtos com preço até 50.0:");
    produtosAgrupados.stream()
        .map(Produto::getNome)
        .forEach(nome -> System.out.println(nome));
  }

  private List<Produto> agruparPorPrecoAcima50() {
    return produtos.stream()
        .filter(produto -> produto.getPreco() >= 50)
        .toList();
  }

  public void listarProdutosAcima50() {
    List<Produto> produtosAgrupados = agruparPorPrecoAcima50();

    System.out.println("Nomes dos produtos com preço acima 50.0:");
    produtosAgrupados.stream()
        .map(Produto::getNome)
        .forEach(nome -> System.out.println(nome));
  }


}
