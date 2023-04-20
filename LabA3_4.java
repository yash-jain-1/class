class Modifier{
    private int a = 1;
    private int b = 2;
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
public class LabA3_4 {
    public static void main(String[] args) {
        Modifier m = new Modifier();
        System.out.println(m.getA());
        System.out.println(m.getB());

    }
}
