package oddEven;

public class EvenThread extends Thread {
    CommonResource resource;
    EvenThread(CommonResource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        while (true) {
            try {
                this.resource.evenNumber();
                Thread.sleep(3000);
            } catch (Exception e) {

            }
        }
    }
}
