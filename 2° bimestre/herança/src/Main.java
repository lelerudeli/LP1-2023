public class Main {
    public static void main(String[] args) {

        Fixo água = new Fixo ("conta água", 70.00);
        Fixo tel = new Fixo ("conta net", 120.90);

        Lazer cinema = new Lazer ("cinema", 15.00, true);
        Lazer parque = new Lazer ("parque", 50.00, false);

        Variável roupa = new Variável ("camiseta", 69.90, 1);
        Variável tv = new Variável("tv samsung", 1.500, 6);


        System.out.printf("-Reajuste de valor cinema-");
        System.out.println("\nValor inicial: " + cinema.getValor());
        cinema.mudarValor(15.00);
        System.out.println("Valor reajustado: " + cinema.getValor());

        System.out.printf("\n");

        System.out.printf("-Reajuste de valor parque-");
        System.out.println("\nValor inicial: " + parque.getValor());
        cinema.mudarValor(50.00);
        System.out.println("Valor reajustado: " + parque.getValor());




    }
}
