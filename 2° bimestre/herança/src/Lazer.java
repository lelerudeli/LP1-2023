public class Lazer extends Gastos {
    private boolean importante;

    public Lazer(String nome, double valor, boolean importante) {
        super(nome, valor);
        this.importante = importante;
    }

    @Override
    public void mudarValor (double valor){
        super.mudarValor(valor + (0.05*valor));
    }
}
