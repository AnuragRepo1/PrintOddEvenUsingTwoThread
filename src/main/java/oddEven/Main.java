package oddEven;

public class Main {
    public static void main(String[] args) {
        CommonResource resource = new CommonResource();
        EvenThread evenThread = new EvenThread(resource);
        OddThread oddThread = new OddThread(resource);
        evenThread.setName("Even");
        oddThread.setName("Odd");
        oddThread.start();
        evenThread.start();
    }
}
