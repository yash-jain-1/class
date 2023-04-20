public class Lab2_4 {
    public static void main(String[] args) {
        Employees Amar = new Employees();
        Amar.address="Delhi";
        Amar.name="Amar";
        Amar.salary=130000;
        Amar.YOJ=2009;
        Amar.printDetails();
    }
}
class Employees{
    String name;
    int YOJ;
    int salary;
    String address;
    public void printDetails(){
        System.out.println("Year of Joining: "+YOJ+" | Name: "+name+" | Salary: "+salary+" | Address: "+address);
    }

}
