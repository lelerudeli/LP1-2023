package loja;

public class clientes {

    private String nome;
    private String cpf;
    private int tel;

    public clientes(String nome, String cpf, int tel){
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void mostraCliente(){
        System.out.println("- Clientes -");
        System.out.println("Nome: "+ this.nome+ " CPF: "+ this.cpf+ " Telefone: "+ this.tel);
        System.out.printf("\n");
    }
}

