import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Your age");
        int n1 = sca.nextInt();

        if (n1 >= 18){
            System.out.println("you are of legal age");
        }else {
            System.out.println("you aren't of legal age");
        }

        sca.close();
    }
}