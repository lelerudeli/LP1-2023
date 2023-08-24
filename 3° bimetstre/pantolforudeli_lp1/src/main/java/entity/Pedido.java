package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity()
@Table(name = "pedido")

    public class Pedido {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int Id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoaId")
    private Pessoa pessoa;
    
    @ManyToMany(cascade = CascadeType.ALL)
    
    @JoinTable(name = "pedido-produto",
        joinColumns = @JoinColumn( name ="pedidoId" ),
            inverseJoinColumns = @JoinColumn(name = "produtoId"))
    
    private static List<Produtos> produtos;

    @Column
    private double precoTotal;

    public Pedido(Pessoa pessoa, List<Produtos> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
        this.precoTotal = precoTotal + retornavalor();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    private static float retornavalor(){
        double valorT = 0;
        for (Produtos produto: produtos) {
            valorT = valorT + produto.getPreco();
        }
        return (float) valorT;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Id=" + Id +
                ", pessoa=" + pessoa +
                ", precoTotal=" + precoTotal +
                '}';
    }
}
