class A6{
    void dumdum(){
        System.out.println("dumdum");
    }
}
class A6_1 extends A6{
    void dumdum(){
        System.out.println("Big DUMDUM");
    }
}
public class LabA6_3 {
    public static void main(String[] args) {
        A6 a = new A6();
        A6_1 b = new A6_1();
        a.dumdum();
        b.dumdum();
    }
}
