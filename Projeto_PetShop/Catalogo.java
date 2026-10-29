public class Catalogo {

    private int idServico;
    private String nomeServico;
    private Double precoServico;
    private int tempo;

    public Catalogo(int idServico, String nomeServico, Double precoServico, int tempo) {

        setIdServico(idServico);
        setNomeServico(nomeServico);
        setPrecoServico(precoServico);
        setTempo(tempo);
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        if (idServico > 0) {
            this.idServico = idServico;
        }
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        if (nomeServico != null && !nomeServico.trim().isEmpty()) {
            this.nomeServico = nomeServico;
        }
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(Double precoServico) {
        if (precoServico > 0) {
            this.precoServico = precoServico;
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if (tempo > 0) {
            this.tempo = tempo;
        }
    }

    public void exibirInformacoes() {

        System.out.println("ID Serviço: " + getIdServico());
        System.out.println("Serviço: " + getNomeServico());
        System.out.println("Valor: R$ " + getPrecoServico());
        System.out.println("Tempo estimado: " + getTempo() + "min");
    }

} // Final da Classe