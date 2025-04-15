import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Value 1:");
        float a = sca.nextFloat();

        System.out.println("Value 2:");
        float b = sca.nextFloat();

        System.out.println("Value 3:");
        float c = sca.nextFloat();

        if ( a + b > c || a + c > b || b + c > a){
            if (a == b && b == c) {
                System.out.println("This is an Equilateral Triangle");
            }else if(a == b || a == c || b == c){
                System.out.println("This is an Isosceles Triangle");
            }else if(a != b && a != c && b != c){
                System.out.println("This is an Scalene Triangle");
            }

        }else {
            System.out.println("This not a Triangle");
        }
        

        sca.close();

    }
}