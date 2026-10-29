public class Pet {

    private int id;
    private int idDono;
    private String nome;
    private String especie;
    private String raca;
    private String porte;
    private int idade;
    private String observacoes;

    public Pet(int id, int idDono, String nome, String especie, String raca, String porte, int idade,
            String observacoes) {

        setId(id);
        setIdDono(idDono);
        setNome(nome);
        setEspecie(especie);
        setRaca(raca);
        setPorte(porte);
        setIdade(idade);
        setObservacoes(observacoes);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public int getIdDono() {
        return idDono;
    }

    public void setIdDono(int idDono) {
        if (idDono > 0) {
            this.idDono = idDono;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie != null && !especie.trim().isEmpty()) {
            this.especie = especie;
        }
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca != null && !raca.trim().isEmpty()) {
            this.raca = raca;
        }
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        if (porte != null && !porte.trim().isEmpty()) {
            this.porte = porte;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) { // Aceita 0 para filhotes com menos de 1 ano
            this.idade = idade;
        }
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes; // Observação pode ser nula/vazia
    }

    public void exibirInformacoes() {

        System.out.println("ID: " + getId());
        System.out.println("ID do proprietário: " + getIdDono());
        System.out.println("Nome do animal: " + getNome());
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Raça: " + getRaca());
        System.out.println("Porte: " + getPorte());
        System.out.println("Idade: " + getIdade());
        System.out.println("Observações: " + getObservacoes());
    }

} // Final da Classe