/**
 * Representa um produto.
 */
public class Produto {
  private final String nome;
  private double preco;

  /**
   * Define o preço do produto.
   *
   * @param preco O preço do produto.
   */
  public void setPreco(double preco) {
    this.preco = preco;
  }

  /**
   * Cria um novo produto com o nome e preço especificados.
   *
   * @param nome O nome do produto.
   * @param preco O preço do produto.
   */
  public Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
  }

  /**
   * Retorna o nome do produto.
   *
   * @return O nome do produto.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Retorna o preço do produto.
   *
   * @return O preço do produto.
   */
  public double getPreco() {
    return preco;
  }
}
