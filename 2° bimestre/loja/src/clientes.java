public class clientes {

    private String nome;
    private String cpf;
    private int telefone;

    public clientes (String nome, String cpf, int tel){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}

