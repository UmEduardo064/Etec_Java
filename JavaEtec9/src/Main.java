import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Purchase value ");
        double com = sca.nextDouble();

        if (com <= 100) {
            double comA = (com * 5)/100;
            com -= comA;

        }else if(com >= 101 && com <= 500) {
            double comA = (com * 10)/100;
            com -= comA;

        }else {
            double comA = (com * 15)/100;
            com -= comA;

        }

        System.out.println("Final Value is: "+ com);

        sca.close();
    }
}