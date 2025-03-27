import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.printf("Type a Number");
        int n1 = sca.nextInt();

        n1 %= 2;

        if(n1 == 1){
            System.out.println("Odd ");
        } else {
            System.out.println("Even ");
        }

        sca.close();
    }
}