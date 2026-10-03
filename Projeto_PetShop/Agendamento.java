public class Agendamento {

    int idAgendamento;
    int idPet;
    int idServico;
    String dataHora;
    String status;
    String observacoes;

public Agendamento(int idAgendamento, int idPet, int idServico, String dataHora, String status, String observacoes) {

    this.idAgendamento = idAgendamento;
    this.idPet = idPet;
    this.idServico = idServico;
    this.dataHora = dataHora;
    this.status = status;
    this.observacoes = observacoes;
}

public void exibirInformacoes() {

    System.out.println("ID do agendamento: " + this.idAgendamento);
    System.out.println("ID do animal: " + this.idPet);
    System.out.println("ID do serviço: " + this.idServico);
    System.out.println("Data e Hora: " + this.dataHora);
    System.out.println("Status: " + this.status);
    System.out.println("Observações: " + this.observacoes);
}

} // Final da Classe