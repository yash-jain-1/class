class A1{
    int z = 6;
    A1(){
        System.out.println("This is a constructor from class A1");
    }
    A1(int a) {
        System.out.println(123);
    }
}
public class LabA5_1 {
    public static void main(String[] args) {
        A1 x = new A1();
        A1 y = new A1(3);
        System.out.println(x.z);
    }
}
