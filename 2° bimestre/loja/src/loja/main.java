package loja;

public class main {

    public static void main (String args[]) {

        loja loja = new loja("lojinha da lele");

        System.out.printf("\n----------------------------- \n");
        System.out.println(" Bem vindo à " + loja.getNome());
        System.out.printf("----------------------------- \n\n");

        clientes cliente = new clientes("lele", "39973705831", 989999518);
        clientes cliente2 = new clientes("totolfo", "375.849.274-63", 92777-3846);
        clientes cliente3 = new clientes("luquinhas", "384.927.546-37", 93654-7354);

        pedidos pedido = new pedidos(cliente, "cropped", 59.90, 9999);
        pedidos pedido2 = new pedidos(cliente2, "calça cargo", 85.90, 1010);
        pedidos pedido3= new pedidos(cliente3, "moletom", 129.90, 0101);



        loja.addCli(cliente);
        loja.addCli(cliente2);
        loja.addCli(cliente3);

        loja.addPed(pedido);
        loja.addPed(pedido2);
        loja.addPed(pedido3);

        loja.listaCliente();
        loja.listaPedido();


       cliente.mostraCliente();
       pedido.mostraPedido();
    }
}
