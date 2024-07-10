import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        even_numbers(num);
        System.out.print("enter number a: ");
        int a = scanner.nextInt();
        System.out.print("enter number b: ");
        int b = scanner.nextInt();
        System.out.println("Ekub (a and b) --> " + ekub(a, b));
    }

    private static int ekub(int a, int b) {
        int ekub = a + 1;
        boolean stop = true;
        while (stop) {
            ekub--;
            if (a % ekub == 0 && b % ekub == 0) {
                stop = false;
            }
        }
        return ekub;
    }

    static void even_numbers(int n) {
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}