package lv.akurss.lesson12.lecture.homework_answers.lecture.Threads;


import sun.java2d.loops.GraphicsPrimitive;

public class ThreadProblemExampleSyncClass {


    private static Account account;
    public static void main(String[] args) {

        account = new Account();
        Thread tread1 = new Thread(new AddRunnable());
        Thread tread2 = new Thread(new SubtractRunnable());

        tread1.run();
        tread2.run();


        while (tread1.isAlive() || tread2.isAlive()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(account.getSum());
    }


    private static class Account {

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        private int sum = 0;

    }
    private static class AddRunnable implements Runnable{
        @Override
        public void run(){

            for (int i = 0; i<10;i++){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
synchronized (account) { /////////////////////////////////////!!!!!!!!!!!!!!!!!!!
    account.setSum(account.getSum() + 10);
}
            }
        }
    }
    private static class SubtractRunnable implements Runnable{
        @Override
        public void run(){

            for (int i = 0; i<10;i++){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (account) {  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    account.setSum(account.getSum() - 10);
                }
            }
        }
    }


}
