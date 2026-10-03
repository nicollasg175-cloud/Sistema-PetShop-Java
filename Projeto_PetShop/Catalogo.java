public class Catalogo {

    int idServico;
    String nomeServico;
    Double precoServico;
    int tempo;

public Catalogo(int idServico, String nomeServico, Double precoServico,int tempo) {

    this.idServico = idServico;
    this.nomeServico = nomeServico;
    this.precoServico = precoServico;
    this.tempo = tempo;
}

public void exibirInformacoes() {

    System.out.println("ID Serviço: " + this.idServico);
    System.out.println("Serviço: " + this.nomeServico);
    System.out.println("Valor: R$ " + this.precoServico);
    System.out.println("Tempo estimado: " + this.tempo + "min");
}

} // Final da Classe