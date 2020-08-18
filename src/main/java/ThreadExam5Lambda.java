public class ThreadExam5Lambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName=Thread.currentThread().getName().toString();
            System.out.println("Lambda Exp "+threadName+" is running");
            System.out.println("Lambda Exp "+ threadName+" finished");
        };

        Thread thread=new Thread(runnable);
        thread.start();


    }
}
