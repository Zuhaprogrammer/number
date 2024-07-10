import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        System.out.print("enter number a: ");
        int a = scanInt.nextInt();
        System.out.print("enter number b: ");
        int b = scanInt.nextInt();
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
}