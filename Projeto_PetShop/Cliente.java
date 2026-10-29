public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    public Cliente(int id, String nome, String cpf, String telefone, String endereco) {

        setId(id);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setEndereco(endereco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()) {
            this.cpf = cpf;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && !telefone.trim().isEmpty()) {
            this.telefone = telefone;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.trim().isEmpty()) {
            this.endereco = endereco;
        }
    }

    public void exibirInformacoes() {

        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
    }

} // Final da Classe