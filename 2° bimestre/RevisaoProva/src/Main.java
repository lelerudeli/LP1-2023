import Model.Empresa;
import Model.Produto;
import Model.Servico;

public class Main {
    public static void main (String[] args) {

        Empresa empresa = new Empresa();
        empresa.addItem(new Produto("vasssoura", 15.0,1));
        empresa.addItem(new Produto("rodo",20.0,0));
        empresa.addItem(new Servico("faxina", 100.0, false));

        empresa.comercializarItem(0);
        empresa.comercializarItem(0);
        empresa.comercializarItem(1);
        empresa.comercializarItem(1);

    }
}