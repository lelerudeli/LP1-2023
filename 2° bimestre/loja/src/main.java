public class main {

    public static void main (String args[]) {

        clientes cliente = new clientes ("lele", "399.737.058-31", 98999-9518);
        clientes cliente1 = new clientes ("totolfo", "375.849.274-63", 92777-3846);
        clientes cliente2 = new clientes ("luquinhas", "384.927.546-37", 93654-7354);
        
        pedidos pedido = new pedidos (cliente, "cropped", 59.90, 9999);
        pedidos pedido2 = new pedidos (cliente2, "calça cargo", 85.90, 1010);
        pedidos pedido3= new pedidos (cliente3, "moletom", 129.90, 0101);

        
        loja.addClientes(clientes);
        loja.addClientes(clientes2);
        Loja.addClientes(clientes3);
        
        loja.addPedidos(pedidos);
        loja.addPedidos(pedidos2);
        loja.addPedidos(pedidos3);
        
        loja.listarcliente();
        loja.listarpedidos();


       // mostrarClientes();
    }
}
