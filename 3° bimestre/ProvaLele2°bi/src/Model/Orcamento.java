package Model;

import Repository.ExibirInterface;

import java.util.ArrayList;
import java.util.List;

public class Orcamento implements ExibirInterface {

    private static long idBase = 0l;
    private long id;
    private List <ItemPedido> itens = new ArrayList<>();
    private double valorTotal;

    public Orcamento() {
        id = idBase++;
    }

    public static long getIdBase() {
        return idBase;
    }

    public long getId() {
        return id;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void addItem(ItemPedido item) {
        itens.add(item);
        valorTotal += valorTotal + item.getValor();
    }

    boolean remocao = false;

    public void removerItem (long id) throws RuntimeException {
        for (ItemPedido i : itens) {
            if (i.getId() == id) {
                itens.remove(i);
                valorTotal = valorTotal - i.getValor();
                remocao = true;
            }

            if (remocao == false) {
                throw new RuntimeException("O item não foi encontrado!");
            }
        }
    }

    @Override
    public void exibir(boolean b) {
        if(b) {
            completo(this);
        } else {
            reduzido(this);
        }
    }

    private void completo(Orcamento o) {
        System.out.println();
        System.out.println("Orçamento " + o.getId());
        for (ItemPedido item : itens) {
            System.out.printf("- %s, %s, %s, %s\n", item.getPeca(), item.getModelo(), item.getTamanho(), item.getValor());
        }
        System.out.println("Valor total do orçamento: R$" + o.getValorTotal());
    }

    private void reduzido(Orcamento o) {
        System.out.print("- Orçamento " + o.getId());
        System.out.printf(", R$%.2f", o.getValorTotal());
    }
}
