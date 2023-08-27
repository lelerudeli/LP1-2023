package entity;

import jakarta.persistence.*;

@Entity //determina que a classe é uma entidade do bdd
@Table (name= "pessoa")//entidade tabela- criar tabela- tabela é a "pessoa"


public class Pessoa {

    @GeneratedValue (strategy = GenerationType.IDENTITY) //gerar valores do id automaticamente | strategy: estrategia p gerar os valores automaticamente
    //chave primária:
    @Id //chave primaria, independente doq seja sempre será @Id
    @Column //determina os atributos como coluna
    private int id;

    //não chaves:
    @Column
    private String nome;
    @Column
    private String sobrenome;
    @Column
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enderecoId")
    private Endereco endereco;


    public Pessoa(String nome, String sobrenome, String email, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
