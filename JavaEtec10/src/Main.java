import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Type your Height: ");
        float m = sca.nextFloat();

        System.out.println("Type your Weight: ");
        float kg = sca.nextFloat();


        float img = (kg / (m * m));

        if (img <= 18.5) {
            System.out.println("Underweight");

        } else if (img >= 18.5 && img <= 24.9) {
            System.out.println("Normal Weight");

        } else if (img >= 25 && img <= 29.9) {
            System.out.println("About Weight");

        } else {
            System.out.println("Obsity");
        }

        sca.close();
    }
}