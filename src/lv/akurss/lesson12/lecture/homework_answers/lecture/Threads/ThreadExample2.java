package lv.akurss.lesson12.lecture.homework_answers.lecture.Threads;

import sun.font.TextRecord;

public class ThreadExample2 {

    public static void main(String[] args) {


        PrintingThread runnable1 = new PrintingThread("BLA");
        PrintingThread runnable2 = new PrintingThread("BLABLA");

        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.start();
        thread1.start();


    }

    private static class PrintingThread implements Runnable {

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





