import Model.*;

public class Main {
    public static void main(String[] args) throws Exception{

    ItemPedido ip1 = new ItemPedido ("camiseta", "manga longa", "M", 79.90 );
    ip1.exibir (true);
        System.out.println();
    ip1.exibir (false);
        System.out.println();

    Orcamento orcamento = new Orcamento();
    orcamento.addItem(ip1);
    orcamento.exibir(true);
        System.out.println();
    orcamento.exibir(false);
        System.out.println();

    ItemPedido ip2 = new ItemPedido("calça", "cargo", "G", 90.00);
    orcamento.addItem(ip2);
    orcamento.exibir(true);
        System.out.println();
    orcamento.removerItem(ip2.getId());
    orcamento.exibir(true);
        System.out.println();

    ItemPedido ip3 = new ItemPedido("calça", "cargo", "G", 90.00);
    orcamento.removerItem(ip3.getId());
    orcamento.exibir(true);
        System.out.println();

    Pedido p1 = new Pedido ("28/09/2023");
    p1.addItem(ip2);
    p1.exibir(true);
        System.out.println();
    p1.exibir(false);
        System.out.println();

    p1.Entregar();
    p1.exibir(false);
        System.out.println();
    p1.Entregar();
    p1.exibir(false);

    }

}
