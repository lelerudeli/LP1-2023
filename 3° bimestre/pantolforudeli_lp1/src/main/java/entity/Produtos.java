package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")

    public class Produtos {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int Id;
    @Column
    private String nome;
    @Column
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
