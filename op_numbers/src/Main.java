import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a--> ");
        int a = scanner.nextInt();
        System.out.print("Enter b--> ");
        int b = scanner.nextInt();
        ekuk(a, b);
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
}