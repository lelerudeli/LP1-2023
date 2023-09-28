package Model;

import Repository.ExibirInterface;

public class ItemPedido implements ExibirInterface {

    private static long idBase = 0L;
    private long id;
    private String peca;
    private String modelo;
    private String tamanho;
    private double valor;

    public ItemPedido(String peca, String modelo, String tamanho, double valor) {
        this.peca = peca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
        id = idBase++;
    }

    public static long getIdBase() {
        return idBase;
    }

    public static void setIdBase(long idBase) {
        ItemPedido.idBase = idBase;
    }

    public long getId() {
        return id;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void exibir(boolean b) {
        if(b==true) {
            System.out.println("Completo");
            System.out.println("Item do pedido: " + id);
            System.out.println("- Peça: " + peca);
            System.out.println("- Modelo: " + modelo);
            System.out.println("- Tamanho: " + tamanho);
            System.out.println("- Valor: R$" + valor);

        }

        else {
            System.out.println("Reduzido");
            System.out.printf("- " + peca + "," + modelo + "," + tamanho + "," + valor);
        }

    }
}
