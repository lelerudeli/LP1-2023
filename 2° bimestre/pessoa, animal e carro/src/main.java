public class main {
    public static void main(String[] args) {
        pessoa Pessoa = new pessoa ("lucas", 34);
        Pessoa.apresentar();

        animal jj = new animal("Carlinhos","cócócóricó", 4);
        jj.apresentar();

        /*System.out.println(pessoa.getNome());
        System.out.println(Animal.getNome());

        System.out.println(pessoa.setIdade(23));

        System.out.println(pessoa.getIdade());*/

    }

    public static void Carro (String[] args) {

        //motor motor = new motor ( 150, 1.6, 8);
        carro carro = new carro("azul", "hb20", "abc1234", 2023, new motor ( 150, 1.6, 8));

        System.out.println(carro.getMotor().getClass());

        carro.adicionarRoda(new roda (25, 32));
        carro.adicionarRoda(new roda (25, 32));
        carro.adicionarRoda(new roda (25, 32));
        carro.adicionarRoda(new roda (25, 32));

        for (roda roda: carro.getRodas()){
            System.out.println(roda.getAro());
        }

    }
}
