package threadPractice;

public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("這是一個子線程的測試："+i);
        }

    }
}
