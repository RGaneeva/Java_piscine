public class Program {
    public static void main(String[] args) {
        int number = 479597;
        int result = 0;

        result += number%10;
        number /= 10;
        result += number%10;
        number /= 10;
        result += number%10;
        number /= 10;
        result += number%10;
        number /= 10;
        result += number%10;
        number /= 10;
        result += number%10;

        System.out.println(result);
    }
}
