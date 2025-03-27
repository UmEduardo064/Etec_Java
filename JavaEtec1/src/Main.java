import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Type a number");

        int n1 = sca.nextInt();

        if(n1 < 0) {
            System.out.println(" is - ");
        }else if(n1 > 0) {
            System.out.println(" is + ");
        }else {
            System.out.println(" 0 ");
        }


        sca.close();
    }
}