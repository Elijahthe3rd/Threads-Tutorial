public class ThreadExam2 {

    public static class myThread extends Thread{
        @Override
        public void run() {
            System.out.println("My Thread running.");
            System.out.println("My Thread finished.");
        }

    }
    public static void main(String[] args) {
        myThread thread=new myThread();
        thread.start();
    }
}
