package loja;

public class pedidos {

    private clientes cliente;
    private String produto;
    private double valor;
    private int código;

    public pedidos(clientes cli, String prod, double val, int cód){

        this.cliente = cli;
        this.produto = prod;
        this.valor = val;
        this.código = cód;
    }

    public clientes getCliente() {
        return cliente;
    }

    public void setCliente(clientes cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public void mostraPedido() {
        System.out.println("- Pedidos -");
        System.out.println("Cliente: " + this.cliente + "| Produto: " + this.produto + "| Valor: " + "| Código: " + this.código);
        System.out.printf("\n\n");

    }
}