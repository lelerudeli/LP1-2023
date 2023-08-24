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
    
    private List<Produtos> produtos;

    public Pedido(Pessoa pessoa, List<Produtos> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
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

    @Override
    public String toString() {
        return "Pedido{" +
                "Id=" + Id +
                ", pessoa=" + pessoa +
                '}';
    }
}
