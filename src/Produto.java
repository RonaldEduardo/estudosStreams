public class Produto {
  private final String nome;
  private double preco;

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }
}
