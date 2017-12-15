package lv.akurss.lesson12.lecture.homework_answers.lecture.Threads;

public class ThreadExample {

    public static void main(String[] args) {


        PrintingThread thread1 = new PrintingThread("BLA");
        PrintingThread thread2 = new PrintingThread("BLABLA");

    }

    private static class PrintingThread extends Thread {

        public PrintingThread(String message) {

            this.message = message;
        }

        private String message;

        @Override
        public void run() {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();


                for (int i = 0; i < 10; i++) {
                    System.out.println(message);
                }


            }
        }

    }
}





