import java.util.List;

public class OrdemAlfabetica {
   private final List<Produto> produtos;

  public OrdemAlfabetica(List<Produto> produtos) {
    this.produtos = produtos;
  }

  public List<Produto> ordemAlfabetica() {
    return produtos.stream()
    .sorted((produto1, produto2) -> produto1.getNome().toLowerCase().compareTo(produto2.getNome()))
    .toList();
  }
}
