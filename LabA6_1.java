// Program to implement array of objects
class Car{
    private String name;
    public String getName() {
        return name;
    }
    Car(String name){
        this.name = name;
        System.out.println("Chhooo...");
    }
}
public class LabA6_1 {
    public static void main(String[] args) {
//        Car[] cars = {Fiat,Ciaz,Ritz};
        Car[] cars = new Car[3];
        cars[0] = new Car("Fiat");
        cars[1] = new Car("Ciaz");
        cars[2] = new Car("Ritz");
        for (Car x:cars
             ) {
            System.out.println(x.getName());
        }
    }
}
