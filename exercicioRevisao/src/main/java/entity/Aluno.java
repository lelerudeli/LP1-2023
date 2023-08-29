package entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table (name = "aluno")

public class Aluno {

    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String senha;
    @Column
    private String nome;
    @Column
    private String prontuario;
    @Column
    private Double media;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "notas_do_aluno")
    private List<Nota> notas;



    public Aluno(String senha, String nome, String prontuario, Double media) {
        this.senha = senha;
        this.nome = nome;
        this.prontuario = prontuario;
        this.media = media;
        this.notas = new ArrayList<>(); //lista vazia
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

    //se o vetor estiver vazio (size) retornar o próprio valor da nota, se não, adicionar a nova nota à média e dividir por 2.
    //criar if else da média das notas

    public void add(Nota nota) {

        this.getNotas().add(nota);

        if (this.notas.size() == 1) {
            media = nota.getNota();
        } else {
            media = (media + nota.getNota()) / 2;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", media=" + media +
                ", notas=" + notas +
                '}';
    }
}