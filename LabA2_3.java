class hello{
    static int count = 0;
    {count++;}
    hello(){
    }
    hello(int e){
    }
}
public class LabA2_3 {
    public static void main(String[] args) {
        hello h = new hello();
        hello h2 = new hello(8);
        System.out.println(hello.count);
    }
}
