class Animal{
    String anima;
    Animal(){
    }
    Animal(String anima){
        this.anima = anima;
    }
    void makeSound(){
        System.out.println("makes sound");
    }
    void makeSound(String anima){
        System.out.println(anima+" makes sound");
    }
}
class Ape extends Animal{
    @Override
    void makeSound(){
        System.out.println("ape makes sound");
    }
}
public class LabA7_1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Ape b = new Ape();
        Animal c = new Animal("Bhalu");
        c.makeSound("Bhalu");
        a.makeSound();
        b.makeSound();
    }
}
