import org.w3c.dom.ls.LSOutput;

class Circle{
    int r;
    Circle(int r){
        this.r = r;
    }
    double Area(){
        return (3.14)*r*r;
    }
    double Perimeter(){
        return 2*(3.14)*r;
    }
}
public class LabA3_1 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.Area());
        System.out.println(c.Perimeter());
    }



}
