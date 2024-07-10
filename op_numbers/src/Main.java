import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number: ");
        int n = scanner.nextInt();
        printPerfectNumbers(n);
    }

    public static void printPerfectNumbers(int n) {
        for (int num = 1; num <= n; num++) {
            if (isPerfect(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPerfect(int num) {
        int summa = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                summa += i;
            }
        }
        return summa == num;
    }
}