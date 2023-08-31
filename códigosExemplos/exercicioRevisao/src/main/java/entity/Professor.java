package entity;

import jakarta.persistence.*;

@Entity
@Table (name = "professor")

public class Professor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String senha;
    @Column
    private String cpf;
    @Column
    private String nome;
    @Column
    private String prontuario;


    public Professor(String senha, String cpf, String nome, String prontuario) {
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
        this.prontuario = prontuario;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getProntuario() {
        return prontuario;
    }


    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }


    @Override
    public String toString() {
        return "Professor [id=" + id + ", senha=" + senha + ", cpf=" + cpf + ", nome=" + nome + ", prontuario="
                + prontuario + "]";
    }




}
