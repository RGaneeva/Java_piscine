import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNextInt()) {
            System.err.println("Illegal Argument");
            System.exit(-1);
        }

        int number = scan.nextInt();
        if (number <= 1) {
            System.err.println("Illegal Argument");
            System.exit(-1);
        }

        boolean isPrime = true;
        int i = 2;
        while (i * i <= number && isPrime == true){
            if (number % i == 0) {
                isPrime = false;
            }
            i++;
        }
        System.out.println(isPrime + " " + (i - 1));
    }
}
