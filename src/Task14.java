import java.util.Scanner;

public class Task14 {

    public static int transformDigits(int n) {
        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                digit = digit + 1;
            } else {
                digit = digit - 1;
            }

            result = result + digit * place;
            place = place * 10;
            n = n / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(transformDigits(n));

        sc.close();
    }
}