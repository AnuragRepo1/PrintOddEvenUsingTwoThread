package oddEven;

public class CommonResource {
    int n = 1 ;

    public void oddNumber() throws InterruptedException {
        synchronized(this) {
            if (this.n % 2 == 0) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() +" -->" + this.n);
            this.n = this.n + 1;
            notify();
        }
    }
    public  void evenNumber() throws InterruptedException {
        synchronized(this) {
            if (n % 2 == 1) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " -->" + this.n);
            this.n = this.n + 1;
            notify();
        }
    }
}
