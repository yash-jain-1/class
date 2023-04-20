class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Run");
    }
}
public class LabA8_3 {
    public static void main(String[] args) {
        MyRunnable a = new MyRunnable();
        Thread t = new Thread(a);
        t.start();
    }
}
