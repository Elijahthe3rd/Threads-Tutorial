public class ThreadExam3 {
    public static class myThread implements Runnable{
        @Override
        public void run() {
            System.out.println("thread Runnable is running");
            System.out.println("thread Runnable is finished");
        }
    }


    public static void main(String[] args) {
        Thread thread=new Thread(new myThread());
        thread.start();
    }
}
