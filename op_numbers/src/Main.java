import java.util.Scanner;

<<<<<<< HEAD
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
=======
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
        System.out.println("Ekub (a and b) --> "  + ekub(a,b));
        ekuk(a, b);
    }

    private static int ekub(int a,int b){
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

    public static void ekuk(int a, int b){
        int ekuki = a;
        while(true){
            if (ekuki%a == 0 && ekuki%b == 0){
                System.out.println("Ekuk " + a + " and " + b + " is: " + ekuki);
                return;
            }
            ekuki++;
        }
    }

    static void even_numbers(int n) {
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
>>>>>>> 0bddcf41d1ff7708a36f1dcc47ba1a041c2e3c86
    }
}