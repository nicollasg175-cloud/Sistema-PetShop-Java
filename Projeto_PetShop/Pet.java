public class Pet {

    int id;
    int idDono;
    String nome;
    String especie;
    String raca;
    String porte;
    int idade;
    String observacoes;



public Pet (int id, int idDono, String nome, String especie, String raca, String porte, int idade, String observacoes) {

    this.id = id;
    this.idDono = idDono;
    this.nome = nome;
    this.especie = especie;
    this.raca = raca;
    this.porte = porte;
    this.idade = idade;
    this.observacoes = observacoes;
}

public void exibirInformacoes() {

    System.out.println("ID: " + this.id);
    System.out.println("ID do proprietário: " + this.idDono);
    System.out.println("Nome do animal: " + this.nome);
    System.out.println("Espécie: " + this.especie);
    System.out.println("Raça: " + this.raca);
    System.out.println("Porte: " + this.porte);
    System.out.println("Idade: " + this.idade);
    System.out.println("Observações: " + this.observacoes);
}

} // Final da Classe