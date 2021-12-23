package threads.thread_interupt;

public class MessageLooper implements Runnable{


    @Override
    public void run() {
        String[] Tmht = {"harold","bill","bob","jon"};
        for (String turtle: Tmht){
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " " + turtle);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
