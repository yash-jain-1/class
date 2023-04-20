class A3{
    private int a;
    private int b;
    A3(){
        System.out.println("This is a 1st constructor from A3");
    }

    public int getA() {
        return a;
    }
    public void getA(int x){
        System.out.println(a+x);
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
public class LabA5_3 {
    public static void main(String[] args) {
        A3 x = new A3();
        x.setA(10);
        x.getA(8);
        x.setB(7);
        System.out.println(x.getB());
    }
}
