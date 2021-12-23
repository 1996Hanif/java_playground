package threads.basic_threads;

public class App {

    public static void main(String[] args) {


        Thread threadOne = new Thread(new Looper());
        Thread threadTwo = new Thread(new Looper());

        try {
            threadOne.start();
            threadOne.join();
            threadTwo.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
