package loja;

import java.util.ArrayList;
import java.util.List;

public class loja {

    private String nome;
    private List<clientes> cliente = new ArrayList<>();
    private List<pedidos> pedido = new ArrayList<>();

    public loja(String nome) {
        this.nome = nome;
    }

    public void listaCliente() {
        for (int i = 0; i < cliente.size(); i++) { //até o tamanho da variavel
            cliente.get(i).mostraCliente(); //funcao
        }
    }
    public void listaPedido() {
        for (int i = 0; i < pedido.size(); i++) { //até o tamanho da variavel
            pedido.get(i).mostraPedido(); //funcao
        }
    }

    public void addCli (clientes cliente){
        this.cliente.add(cliente);

    }
    public void addPed (pedidos pedido){
        this.pedido.add(pedido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<clientes> getCliente() {
        return cliente;
    }

    public void setCliente(List<clientes> cliente) {
        this.cliente = cliente;
    }

    public List<pedidos> getPedido() {
        return pedido;
    }

    public void setPedido(List<pedidos> pedido) {
        this.pedido = pedido;
    }

    public void mostrarClientes() {
        System.out.println(cliente);
    }
}
