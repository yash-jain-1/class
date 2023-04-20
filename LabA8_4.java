abstract class Electronic{
    abstract void screen();
}
class SmartPhone extends Electronic{
    void screen(){
        System.out.println("LED Screen On");
    }
}
class CelllPhone extends Electronic{
    void screen(){
        System.out.println("Normal Screen On");
    }
}
public class LabA8_4 {
    public static void main(String[] args) {
        CelllPhone c = new CelllPhone();
        c.screen();
        SmartPhone s = new SmartPhone();
        s.screen();
    }
}
