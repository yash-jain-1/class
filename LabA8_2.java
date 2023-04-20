interface World{
    public void showWorld();
}
interface Continent extends World{
    public void showContinent();
}
interface Country extends Continent{
    public void showCountry();
}
interface  State extends Country{
    public  void showState();
}
class Dumbfuck implements State{
    String A = "kkk";
    String B = "lll";
    int b = Integer.parseInt(B);
    @Override
    public void showWorld() {
        System.out.println("Earth");
    }

    @Override
    public void showContinent() {
        System.out.println("Europe");
    }

    @Override
    public void showCountry() {
        System.out.println("Norway");
    }

    @Override
    public void showState() {
        System.out.println("Copenhagen");
    }
}

public class LabA8_2 {
    public static void main(String[] args) {
        Dumbfuck s = new Dumbfuck();
        s.showContinent();
        s.showState();
        s.showCountry();
        s.showWorld();
    }
}
