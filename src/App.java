import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolhaUser = 0;

        List<Produto> produtos = List.of(
                new Produto("Coca", 1.0),
                new Produto("Sprite", 121.0),
                new Produto("Pepsi", 11.0),
                new Produto("Fanta", 9.0),
                new Produto("Guarana", 50.50));

        FiltrarProdutos filtro = new FiltrarProdutos(produtos);
        SomarProdutos somador = new SomarProdutos(produtos);
        ProdutoMaisCaro produtoMaisCaro = new ProdutoMaisCaro(produtos);

        System.out.printf("Escolha uma opção:\n1 - Listar produtos acima de 50\n2 - Somar preços\n3 - Produto mais caro\n");
        escolhaUser = scan.nextInt();
        switch (escolhaUser) {
            case 1:
                List<Produto> produtosFiltrados = filtro.listarProdutosAcimaDe50();

                System.out.println("Nomes dos produtos com preço acima de 50.0:");
                produtosFiltrados.stream()
                        .map(Produto::getNome)
                        .forEach(nome -> System.out.println(nome));
                break;
            case 2:
                double total = somador.somarPrecos();
                System.out.println("Total dos produtos: " + total);
                break;
            case 3:
                double maisCaro = produtoMaisCaro.FiltraProdutoMaisCaro().getAsDouble();
                System.out.println("Produto mais caro: " + maisCaro);
                break;

            default:
                break;
        }

        scan.close();
    }
}
