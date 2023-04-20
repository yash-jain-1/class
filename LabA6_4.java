//	Write a Java Program to implement multilevel inheritance by applying various access controls to its data members and methods.
class Animal1{
    private String state = "alive";
    private String name;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }
    public void eat(){
        System.out.println("Eating...");
    }
    // protected class can only be accessed by children and grandchildren
    protected void sleep(){
        System.out.println("Sleeping...");
    }
}
class Dog1 extends Animal1{
    private int age;
    void barks(){
        System.out.println("Barks...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Husky extends Dog1{
    void display(){
        setAge(12);
        setName("Siberian Husky ");
        System.out.println(getName()+getAge());
    }
}
public class LabA6_4 {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.display();
    }
}
