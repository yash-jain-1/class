import java.util.*;
class Count{
    int count = 0 ;
    Count(int a){
        while (a>0){
            a = a-(a%10);
            a = a/10;
            count++;
        }

    }
}
public class LabA3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. :");
        int a = sc.nextInt();
        Count c = new Count(a);
        System.out.println(c.count);

    }
}
