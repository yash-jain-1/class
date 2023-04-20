class A2{
    private int a;
    private int b;
    A2(){
        System.out.println("This is a 1st constructor from A2");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
public class LabA5_2 {
    public static void main(String[] args) {
        A2 x = new A2();
        x.setA(7);
        System.out.println(x.getA());
        x.setB(8);
        System.out.println(x.getB());

    }
}
