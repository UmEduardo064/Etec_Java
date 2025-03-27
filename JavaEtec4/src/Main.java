import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Type1: ");
        int n1 = sca.nextInt();

        System.out.println("Type2: ");
        int n2 = sca.nextInt();

        System.out.println("Type3: ");
        int n3 = sca.nextInt();


        int me =(n1 + n2 + n3)/3;

        if (me >= 6){
            System.out.println("Approved");
        }else   {
            System.out.println("failded");
        }

        sca.close();
    }
}