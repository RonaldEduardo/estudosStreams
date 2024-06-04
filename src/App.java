import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolhaUser = 0;
        final String MENU = "Escolha uma opção:\n" + "1 - Filtrar produtos com preço acima de 50\n"
                + "2 - Somar preços de todos os produtos\n" + "3 - Encontrar produto mais caro\n"
                + "4 - Ordenar produtos em ordem alfabética\n" + "5 - Aplicar desconto de 10%% a todos os produtos\n"
                + "6 - Contar a quantidade de produtos com preço entre 30 e 100\n" + "7 - Agrupar produtos por preço até 50\n"
                + "8 - Agrupar produtos por preço acima de 50\n";

        List<Produto> produtos = List.of(
                // Cria uma lista de produtos com seus nomes e preços
                new Produto("Sprite", 131.0),
                new Produto("Pepsi", 11.0),
                new Produto("Fanta", 9.0),
                new Produto("Guarana", 50.50),
                new Produto("Pizza", 60.0),
                new Produto("Hamburger", 45.0),
                new Produto("Hot Dog", 15.0),
                new Produto("Pastel", 25.0),
                new Produto("Salada", 100.0));

        // Cria um novo objeto de filtro com a lista de produtos
        FiltrarProdutos filtro = new FiltrarProdutos(produtos);

        // Cria um novo objeto de soma com a lista de produtos
        SomarProdutos somador = new SomarProdutos(produtos);

        // Cria um novo objeto para encontrar o produto mais caro com a lista de
        // produtos
        ProdutoMaisCaro produtoMaisCaro = new ProdutoMaisCaro(produtos);

        // Cria um novo objeto para ordenar os produtos em ordem alfabética
        OrdemAlfabetica ordemAlfabetica = new OrdemAlfabetica(produtos);

        // Cria um novo objeto para aplicar desconto a todos os produtos
        AplicaDesconto desconto = new AplicaDesconto(produtos);

        // Cria um novo objeto para contar a quantidade de produtos com preço entre 30 e 100
        ContarProdutos contarProdutos = new ContarProdutos(produtos);

        // Cria um novo objeto para agrupar os produtos por preço
        AgruparProduto agruparProduto = new AgruparProduto(produtos);

        // Imprime as opções para o usuário
        System.out.printf(MENU);

        // Obtém a escolha do usuário
        escolhaUser = scan.nextInt();

        // Declaração switch para lidar com a escolha do usuário
        switch (escolhaUser) {
            case 1:
                // Se o usuário escolher 1, filtra os produtos com preço acima de 50 e imprime
                filtro.listarProdutosAcimaDe50();
                break;
            case 2:
                // Se o usuário escolher 2, soma os preços de todos os produtos
                double total = somador.somarPrecos();
                System.out.println("Total dos produtos: " + total);
                break;
            case 3:
                // Se o usuário escolher 3, encontra o produto mais caro
                double maisCaro = produtoMaisCaro.FiltraProdutoMaisCaro().getAsDouble();
                System.out.println("Produto mais caro: " + maisCaro);
                break;
            case 4:
                // Se o usuário escolher 4, ordena os produtos em ordem alfabética e imprime
                ordemAlfabetica.listarProdutosOrdemAlfabetica();
                break;
            case 5:
                // Se o usuário escolher 5, aplica desconto de 10% a todos os produtos
                List<Produto> produtosComDesconto = desconto.aplicaDesconto();

                // Imprime os nomes e preços dos produtos com desconto
                System.out.println("Nomes e preços dos produtos com desconto:");
                produtosComDesconto.stream()
                        .forEach(produto -> System.out.println(produto.getNome() + " - " + produto.getPreco()));
                break;
            case 6:
                // Se o usuário escolher 6, conta a quantidade de produtos com preço entre 30 e 100
                int quantidade = contarProdutos.contarFaixaDePreco();
                System.out.println("Quantidade de produtos com preço entre 30 e 100: " + quantidade);
                break;

            case 7:
                // Se o usuário escolher 7, agrupa os produtos por preço até 50 e imprime
                agruparProduto.listarProdutosAte50();
                break;
            case 8:
                // Se o usuário escolher 8, agrupa os produtos por preço acima de 50 e imprime
                agruparProduto.listarProdutosAcima50();
                break;

            default:
                // Se o usuário escolher uma opção inválida, imprime uma mensagem de erro
                System.out.println("Opção inválida");
                break;
        }

        // Fecha o objeto scanner
        scan.close();
    }
}
