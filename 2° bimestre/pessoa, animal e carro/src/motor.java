public class motor {

    private int potencia;
    private double classificação;
    private int válvulas;

    public motor (int pot, double classificação, int vál){
        this.potencia = pot;
        this.classificação = classificação;
        this.válvulas = vál;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia (int potencia){
        this.potencia = potencia;
    }


}
