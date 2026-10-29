public class Agendamento {

    private int idAgendamento;
    private int idPet;
    private int idServico;
    private String dataHora;
    private String status;
    private String observacoes;

    public Agendamento(int idAgendamento, int idPet, int idServico, String dataHora, String status,
            String observacoes) {

        setIdAgendamento(idAgendamento);
        setIdPet(idPet);
        setIdServico(idServico);
        setDataHora(dataHora);
        setStatus(status);
        setObservacoes(observacoes);
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int id) {
        if (id > 0) {
            this.idAgendamento = id;
        }
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int id) {
        if (id > 0) {
            this.idPet = id;
        }
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        if (idServico > 0) {
            this.idServico = idServico;
        }
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        if (dataHora != null && !dataHora.trim().isEmpty()) {
            this.dataHora = dataHora;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        }
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes; // Observação pode ser nula/vazia
    }

    public void exibirInformacoes() {

        System.out.println("ID do agendamento: " + getIdAgendamento());
        System.out.println("ID do animal: " + getIdPet());
        System.out.println("ID do serviço: " + getIdServico());
        System.out.println("Data e Hora: " + getDataHora());
        System.out.println("Status: " + getStatus());
        System.out.println("Observações: " + getObservacoes());
    }

} // Final da Classe