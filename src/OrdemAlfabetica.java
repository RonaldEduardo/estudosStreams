// Classe responsável por ordenar os produtos em ordem alfabética

import java.util.List;
import java.util.stream.Collectors;

public class OrdemAlfabetica implements ProdutoService {
  // Lista de produtos
  private final List<Produto> produtos;

  // Construtor que recebe a lista de produtos
  public OrdemAlfabetica(List<Produto> produtos) {
    this.produtos = produtos;
  }

  // Método que retorna a lista de produtos
  @Override
  public List<Produto> getProdutos() {
    return produtos;
  }

  // Método privado que retorna a lista de produtos ordenada alfabeticamente
  private List<Produto> ordemAlfabetica() {
    return getProdutos().stream()
        // Ordena os produtos pelo nome usando o método compareTo da classe String
        .sorted((produto1, produto2) -> produto1.getNome().compareTo(produto2.getNome()))
        // Coleta os produtos ordenados em uma nova lista
        .collect(Collectors.toList());
  }

  // Método público que imprime os nomes dos produtos em ordem alfabética
  public void listarProdutosOrdemAlfabetica() {
    // Obtém a lista de produtos ordenada alfabeticamente
    List<Produto> produtosOrdenados = ordemAlfabetica();

    // Imprime o cabeçalho
    System.out.println("Nomes dos produtos em ordem alfabética:");

    // Imprime o nome de cada produto
    produtosOrdenados.stream()
        .map(Produto::getNome)
        .forEach(nome -> System.out.println(nome));
  }
}
