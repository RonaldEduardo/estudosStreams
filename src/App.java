import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Produto> produtos = List.of(
                new Produto("Coca", 12.90),
                new Produto("Sprite", 11.90),
                new Produto("Pepsi", 11.50),
                new Produto("Fanta", 9.50),
                new Produto("Guarana", 50.90));

        FiltrarProdutos filtro = new FiltrarProdutos(produtos);

        List<Produto> produtosFiltrados = filtro.listarProdutosAcimaDe50();

        System.out.println("Nomes dos produtos com preço acima de 50.0:");
        produtosFiltrados.stream()
                .map(Produto::getNome)
                .forEach(nome -> System.out.println(nome));

    }
}
