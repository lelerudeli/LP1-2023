package main.java.com.example.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table (name = "aluno")

public class Aluno {

    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Long id;

    @Column
    private String senha;
    @Column
    private String nome;
    @Column
    private String prontuario;
    @Column
    private Double media; 

    private List<Nota> notas;

    public Aluno(String senha, String nome, String prontuario, Double media) {
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
        this.media = media;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", senha=" + senha + ", nome=" + nome + ", prontuario=" + prontuario + ", media="
                + media + ", notas=" + notas + "]";
    } 

    
    
}
