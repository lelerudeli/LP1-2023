import java.util.Scanner; //importando os métodos de scanner 

public class revisaoProva { //criando a classe 

    public static void main (String[] args) //iniciando método main 
    {
        String[] nomes  = new String[3]; //craindo string
        double[][] contas = new double [4][4]; //criando vetor 
        Scanner scanner = new Scanner (System.in); //criando um scanner 

        for (int n=0; n<3; n++){
            System.out.println("\nDigite o " + (n+1) + "° nome: ");
            nomes[n] = scanner.next(); //utilizando o scanner criado 
        }

        System.out.println("\nNomes digitados: ");
        Vetor(nomes);

        for (int i=0; i<4; i++) {
            System.out.println("\nDigite um número inteiro de opção!");
            int nmr = scanner.nextInt();
            System.out.println(verificação(nomes, nmr));
        }

        //int l=0;
        //int c=0;

        Matriz(contas);
        //exibirMatriz(c, l, contas);
    }

    public static void Vetor (String[] nomes){

        for (int i=0; i< nomes.length; i++) {
            System.out.print(nomes[i] + " ");
        }
        System.out.println("\n");

    }

    public static void Matriz (double[][] contas) {

        Scanner scan = new Scanner (System.in);

        int l; int c;

        for (l=0; l< contas[0].length; l++) {
            for (c = 0; c < contas[l].length; c++) {
                if(l == 0 && c == 0) {
                    contas [l][c] = 0;
                } else if (l == 0) {
                    System.out.println("\nDigite o "+ c + "° valor: ");
                    contas[l][c] = scan.nextDouble();
                }else if (c == 0){
                    contas [l][c] = contas [c][l];
                }else if (l == c){
                    contas [l][c] = contas [0][c] * contas[l][0];
                }else {
                    contas[l][c] = contas [0][l] - contas [0][c];
                }
            }
        }

        System.out.println();

        for (l = 0; l < contas[0].length; l++) {
            for (c = 0; c < contas[l].length; c++) {
                System.out.print(contas[l][c] + " ");
            }
            System.out.println();
        }
    }
    
    /*public static void exibirMatriz (int c, int l, double contas[][]) {

        for (l = 0; l < contas[0].length; l++) {
            for (c = 0; c < contas[l].length; c++) {
                System.out.print(contas[l][c] + " ");
            }
            System.out.println();
        }
    }*/

    public static String verificação (String[] nomes, int nmr){
            if (nmr == 1) {
                return nomes[0];
            } else if (2 < nmr && nmr < 10) {
                return nomes[1];
            } else if (nmr > 10) {
                return nomes[2];
            } else {
                return "opção inválida";
            }

        }
    }
