import java.util.Scanner;

public class Task1 {

    public static void printStrip(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printStrip(n, '#');

        sc.close();
    }
}
