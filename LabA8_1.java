interface Camera{
    void takeSnapshot();
    void recordVideo();
}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone{
    void call(int number){
        System.out.println("Calling...."+number);
    }
    void pickCall(){
        System.out.println("Connected");
    }
}
public class LabA8_1 {
    public static void main(String[] args) {
        CellPhone c = new CellPhone();
        c.call(9876549);
        c.pickCall();
    }
}
