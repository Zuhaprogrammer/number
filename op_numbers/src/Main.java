import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        primeNumbers(n);
    }

    private static void primeNumbers(int n) {
        int count;
        for (int i = 1; i < n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (i == 1) {
                System.out.print(i + "\t");
            }
            if (count == 2) {
                System.out.print(i + "\t");
            }
        }
    }
}