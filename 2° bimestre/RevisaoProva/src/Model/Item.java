package Model;

import Interface.ComercializarInterface;

public abstract class Item implements ComercializarInterface {

    private static long idBase = 0;
    private long id;
    private String nome;
    private Double preco;

    public Item (String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        id = idBase++;
    }

    public static long getIdBase() {
        return idBase;
    }

    public static void setIdBase(long idBase) {
        Item.idBase = idBase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Item:" +
                "id =" + id +
                ", nome ='" + nome + '\'' +
                ", valor = " + preco +
                '}';
    }
}