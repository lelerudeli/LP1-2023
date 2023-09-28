package Model;

import Repository.ExibirInterface;

public class Pedido extends Orcamento implements ExibirInterface {

    private String dataEntrega;
    private boolean entregue;

    public Pedido (String dataEntrega) {
        this.dataEntrega = dataEntrega;
        entregue = false;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void Entregar () throws Exception {
        if(entregue == true) {
            throw new Exception("O pedido já foi entregue!");
        }
        entregue = true; 
    }


    @Override
    public void exibir(boolean b) {
            if (b) {
                pedidoCompleto(this);
            } else {
                pedidoReduzido(this);
            }
        }

    private void pedidoCompleto(Pedido p) {
        System.out.println("Pedido " + p.getId());
        System.out.println("Itens:");
        for (ItemPedido item : getItens()) {
            System.out.println("- " + item.getPeca() + ", " + item.getModelo() + ", " + item.getTamanho() + ", " + item.getValor());
        }
        System.out.println("Data de Entrega: " + p.getDataEntrega());
        System.out.print("Situação: ");
        if(entregue) {
            System.out.print("Entregue");
        } else {
            System.out.print("Não entregue");
        }
        System.out.println();
        System.out.println("Valor Total: R$" + p.getValorTotal());
    }

    private void pedidoReduzido(Pedido p) {
        System.out.print("- Pedido " + p.getId());
        System.out.printf(", %s, ", p.getDataEntrega());
        System.out.print(" Situação: ");
        if(p.entregue) {
            System.out.print("Entregue");
        } else {
            System.out.print("Não entregue");
        }
        System.out.printf(", %s", p.getValorTotal());
    }
}
