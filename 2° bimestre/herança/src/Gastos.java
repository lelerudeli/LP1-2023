public abstract class Gastos {

    private String nome;
    private double valor;

    public Gastos(String nome, double valorI) {
        this.nome = nome;
        this.valor = valorI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void mudarValor(double valorF){
        this.valor = valorF;
    }
}
