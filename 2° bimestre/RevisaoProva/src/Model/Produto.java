package Model;

import Exception.ComercializarException;

public class Produto extends Item {

    private int estoque;

    public Produto (String nome, Double preco, int estoque) {
        super(nome, preco);
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return super.toString() + "Produto {" +
                "estoque =" + estoque +
                '}';
    }

    public void Comercializa () throws ComercializarException {
        if (estoque <= 0) {
            throw new ComercializarException("acabou os produtos, estamos sem estoque!");
        }
        estoque -= estoque;
    }
}