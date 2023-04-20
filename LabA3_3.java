import java.util.Scanner;
class Digits {
    static int multi = 1;
    static int sumo = 0;

    Digits(int a) {
        while (a > 0) {
            sumo += a % 10;
            multi = multi * (a % 10);
            a = a - (a % 10);
            a = a / 10;
        }

    }
}
    public class LabA3_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no. :");
            int a = sc.nextInt();
            Digits c = new Digits(a);
            System.out.println("Multi:" + c.multi);
            System.out.println("Sum:" + c.sumo);
        }
    }

