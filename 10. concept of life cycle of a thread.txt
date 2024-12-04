public class Main extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is in RUNNING state...");
        try {
            Thread.sleep(1000);
            System.out.println("Thread is in TIMED WAITING state.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread has FINISHED RUNNING.");
    }

    public static void main(String[] args) {
        Main thread = new Main();
        System.out.println("Thread is in NEW state.");
        thread.start();
        System.out.println("Thread is in RUNNABLE state.");
    }
}
