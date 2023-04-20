import java.util.ArrayList;
import java.util.List;
// Write a Java Program to implement Wrapper classes and their methods.
public class LabA6_2 {
    public static void main(String[] args) {
        List <Integer> intList = new ArrayList<>();
        Integer i = Integer.valueOf(88);
        intList.add(i);
        intList.add(2);
        intList.add(2,5);
        intList.add(3,3);

        for (Integer x: intList) {
            System.out.println(x);
        }
    }
}
