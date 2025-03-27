import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Side1 (Triangle): ");
        int n1 = sca.nextInt();

        System.out.println("Side2 (Triangle): ");
        int n2 = sca.nextInt();

        System.out.println("Side3 (Triangle): ");
        int n3 = sca.nextInt();

        int lados = n1 + n2;

        if (lados >= n3){
            System.out.println("Is a Triangle");
        }else {
            System.out.println("Isn't a Triangle");
        }

        sca.close();
    }
}