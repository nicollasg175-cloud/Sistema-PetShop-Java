public class Produto {

    int idProduto;
    String nomeProduto;
    double precoVenda;
    int quantidade;

public Produto(int idProduto, String nomeProduto, double precoVenda, int quantidade) {

    this.idProduto = idProduto;
    this.nomeProduto = nomeProduto;
    this.precoVenda = precoVenda;
    this.quantidade = quantidade;
}

public void exibirInformacoes() {

    System.out.println("ID do produto: " + this.idProduto);
    System.out.println("Nome: " + this.nomeProduto);
    System.out.println("Preço: " + this.precoVenda);
    System.out.println("Quantidade: " + this.quantidade + "un.");
}

} // Final da Classe