package threads.basic_threads;

public class ThreadExamples {
    public static class ExampleThread implements Runnable{
        @Override
        public void run() {
            System.out.println("im a thread");
        }

    }

    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName()+": "+Thread.currentThread().getName());

//        Thread ourThread = new Thread(new ExampleThread());
//        System.out.println(ourThread.getId());
//        System.out.println(ourThread.getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
