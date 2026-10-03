public class Cliente {

    int id;
    String nome;
    String cpf;
    String telefone;
    String endereco;

public Cliente (int id, String nome, String cpf, String telefone, String endereco) {

    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;
}

public void exibirInformacoes() {

    System.out.println("ID: " + this.id);
    System.out.println("Nome: " + this.nome);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Telefone: " + this.telefone);
    System.out.println("Endereço: " + this.endereco);
}

} // Final da Classe