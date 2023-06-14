package Model;

import Exception.ComercializarException;
public class Servico extends Item {

    private boolean disponível;

    public Servico(String nome, Double preco, boolean disponível) {
        super(nome, preco);
        this.disponível = true;
    }

    public boolean isDisponível() {
        return disponível;
    }

    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }

    @Override
    public String toString() {
        return super.toString() + "Serviço { " +
                "disponível = " + disponível + "}";
    }

    public void Comercializa () throws ComercializarException {
        if (disponível == false) {
            throw new ComercializarException("serviço indisponível!");
        }
        disponível = false;

    }
    public void Liberar() throws ComercializarException {
        if (disponível == true){
            throw new ComercializarException("serviço já disponível!");
        }
        disponível = true;

    }
}