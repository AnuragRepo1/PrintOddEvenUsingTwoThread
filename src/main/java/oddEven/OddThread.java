package oddEven;

public class OddThread extends Thread{
    CommonResource resource;
    OddThread(CommonResource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        while (true){
            try {
                this.resource.oddNumber();
                Thread.sleep(2000);
            }catch(Exception e){

            }

        }
    }
}
