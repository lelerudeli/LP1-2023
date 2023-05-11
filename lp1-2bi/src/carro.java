import java.util.ArrayList;
import java.util.List;

public class carro {

    private String cor;
    private String modelo;
    private String placa;
    private int ano;
    private motor motor;
    private List<roda> rodas  = new ArrayList<>();


    public carro(String cor, String modelo, String placa, int ano, motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.motor = motor;
    }

    public void adicionarRoda (roda roda){
        this.rodas.add(roda);
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public motor getMotor() {
        return motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }

    public List<roda> getRodas() {
        return rodas;
    }

    public void setRodas(List<roda> rodas) {
        this.rodas = rodas;
    }
}

