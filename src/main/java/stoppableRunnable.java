public class stoppableRunnable {
    public static class myStoppalbeRunner implements Runnable {
        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        public void sleep(long milli) {
            try {
                Thread.sleep(milli);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println("stoppableRunnable running");
            while (!isStopRequested()) {
                sleep(1000);
                System.out.println("... (-_-)");
            }
            System.out.println("stoppableRunnable stopped ");
        }
    }

    public static void main(String[] args) {
        myStoppalbeRunner myStopRunnable = new myStoppalbeRunner();
        Thread thread = new Thread(myStopRunnable);
        thread.start();

        try {
            System.out.println("Taking 5seconds rest");
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Requesting stop");
        myStopRunnable.requestStop();

    }
}
