import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);

    System.out.println("Type your Wage: ");
    double sal = sca.nextDouble();

        if (sal >= 2000){
            double salA = (sal * 5)/100;
            sal += salA;

        }else if (sal < 2000) {
            double salA = (sal * 10)/100;
            sal += salA;

        }else {
            System.out.println("Error");
        }

        System.out.println("Your wage is: " + sal);

        sca.close();
    }
}