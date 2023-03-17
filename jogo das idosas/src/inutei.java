import java.util.Arrays;
import java.util.Scanner;
public class inutei {

    public static void xo(char args) {
        
        Scanner scanner = new Scanner(System.in);
        

    }
        
    
    public static void main(String[] args) {
        
        char[][] lincol = new char [3][3];
        Arrays.fill(lincol, ' ');

        boolean oi = vitoria(lincol);
        while (!vitoria(lincol)) {
            exibirTabuleiro(lincol);

        }
        System.out.println(oi);
    

    while(!vitoria(lincol))
            {
                exibirTabuleiro(lincol);

            }
        }

    public static boolean vitoria(char[][] lincol) {
        // lincol[0][0];

        for (int l = 0; l < 3; l++) {
            System.out.println(" ");
            for (int c = 0; c < 3; c++) {
                System.out.print(lincol[l][c]);
                System.out.print(" ");
            }
        }

        if (lincol[0][0] == 'x' && lincol[0][1] == 'x' && lincol[0][2] == 'x' || lincol[0][0] == 'o' && lincol[0][1] == 'o' && lincol[0][2] == 'o') {
            return true;
        } else if (lincol[1][0] == 'x' && lincol[1][1] == 'x' && lincol[1][2] == 'x' || lincol[1][0] == 'o' && lincol[1][1] == 'o' && lincol[1][2] == 'o') {
            return true;
        } else if (lincol[2][0] == 'x' && lincol[2][1] == 'x' && lincol[2][2] == 'x' || lincol[2][0] == 'o' && lincol[2][1] == 'o' && lincol[2][2] == 'o') {
            return true;
        } else if (lincol[0][0] == 'x' && lincol[1][0] == 'x' && lincol[2][0] == 'x' || lincol[0][0] == 'o' && lincol[1][0] == 'o' && lincol[2][0] == 'o') {
            return true;
        } else if (lincol[0][1] == 'x' && lincol[1][1] == 'x' && lincol[2][1] == 'x' || lincol[0][1] == 'o' && lincol[1][1] == 'o' && lincol[2][1] == 'o') {
            return true;
        } else if (lincol[0][2] == 'x' && lincol[1][2] == 'x' && lincol[2][2] == 'x' || lincol[0][2] == 'o' && lincol[1][2] == 'o' && lincol[2][2] == 'o') {
            return true;
        } else if (lincol[0][0] == 'x' && lincol[1][1] == 'x' && lincol[2][2] == 'x' || lincol[0][0] == 'o' && lincol[1][1] == 'o' && lincol[2][2] == 'o') {
            return true;
        } else if (lincol[0][2] == 'x' && lincol[1][1] == 'x' && lincol[2][0] == 'x' || lincol[0][2] == 'o' && lincol[1][1] == 'o' && lincol[2][0] == 'o') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean exibirTabuleiro(char[][] lincol) {

        for (int l = 0; l < 3; l++) {
            System.out.println(" ");
            for (int c = 0; c < 3; c++) {
                System.out.print(lincol[l][c]);
                System.out.print(" ");
            }
        }

        return true;
    }

    public static boolean empate(boolean oi) {
        if (oi == false){
            return true;}
        else{return false;
        }
    }


}

