import java.util.Scanner;
import java.util.SortedMap;

public class LL {
    public static void main(String[] args) {
        char yn;
        do{
        System.out.println("Type your prefer mathemathic symbol: (ex:  +, -, /, *)");
        Scanner symb = new Scanner(System.in);
        char simbolo = symb.next().charAt(0);
        System.out.println("You typed " + simbolo);

        System.out.println("\nType the first number: ");
        Scanner num = new Scanner (System.in);
        double n1 = num.nextDouble();
        System.out.println("You typed " + n1);

        System.out.println("\nType the second number: ");
        double n2 = num.nextDouble();
        System.out.println("You typed " + n2);

        System.out.println("\nThe result is: ");
        switch (simbolo) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("\npara de graça otario");
        }
            System.out.println("\nDo you wanna continue? (y = yes; n = no)");
        Scanner answ = new Scanner(System.in);
        yn = answ.next().charAt(0);

        }  while (yn == 'y');
System.out.println("Finish code");







    } }
