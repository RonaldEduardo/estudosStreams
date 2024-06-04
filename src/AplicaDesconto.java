import java.util.List;

// Classe responsável por aplicar desconto aos produtos
public class AplicaDesconto implements ProdutoService{
  // Lista de produtos
  private final List<Produto> produtos;

  // Construtor que recebe a lista de produtos
  public AplicaDesconto(List<Produto> produtos) {
    this.produtos = produtos;
  }

  // Método que retorna a lista de produtos
  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }

  // Método que aplica desconto de 10% a todos os produtos
  public List<Produto> aplicaDesconto() {
    return getProdutos().stream()
        // O método peek é usado para alterar o preço de cada produto
        .peek(produto -> produto.setPreco(produto.getPreco() * 0.90))
        // O método toList coleta os produtos em uma nova lista
        .toList();
  }
}
