import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Type a number: ");
        int n1 = sca.nextInt();

        if (n1 >= 10 && n1 <= 50){
            System.out.println("Is in the range of 10 to 50");
        }else {
            System.out.println("Is out of range");
        }

        sca.close();
    }
}