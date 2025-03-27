import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Type1: ");
        int n1 = sca.nextInt();

        System.out.println("Type2: ");
        int n2 = sca.nextInt();

        if (n1 > n2){
            System.out.printf("%d is greater than %d", n1, n2);
        }else {
            System.out.println("Numbers are the same");
        }

        sca.close();
    }
}