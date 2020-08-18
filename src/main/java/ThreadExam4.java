public class ThreadExam4 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Interface Thread Runnable running");
                System.out.println("Interface Thread Runnable finished");
            }
        };

        Thread thread=new Thread(runnable);
        thread.start();
    }
}
