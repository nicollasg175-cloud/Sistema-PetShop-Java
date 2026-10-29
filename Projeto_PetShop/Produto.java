public class Produto {

    private int idProduto;
    private String nomeProduto;
    private double precoVenda;
    private int quantidade;

    public Produto(int idProduto, String nomeProduto, double precoVenda, int quantidade) {

        setIdProduto(idProduto);
        setNomeProduto(nomeProduto);
        setPrecoVenda(precoVenda);
        setQuantidade(quantidade);
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        if (idProduto > 0) {
            this.idProduto = idProduto;
        }
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        if (nomeProduto != null && !nomeProduto.trim().isEmpty()) {
            this.nomeProduto = nomeProduto;
        }
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda >= 0) {
            this.precoVenda = precoVenda;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public void exibirInformacoes() {

        System.out.println("ID do produto: " + getIdProduto());
        System.out.println("Nome: " + getNomeProduto());
        System.out.println("Preço: " + getPrecoVenda());
        System.out.println("Quantidade: " + getQuantidade() + "un.");
    }

} // Final da Classe