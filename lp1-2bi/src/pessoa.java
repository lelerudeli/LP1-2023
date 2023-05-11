public class pessoa {

    public String nome;
    public int idade;

    public pessoa(){}

    public pessoa(String nome, int idade) {
        System.out.println("criei uma nova pessoa!");
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){

        System.out.println("Olá! meu nome é " + this.nome + "e tenho " + this.idade + "anos.");
    }
}
