package tcstraining.day5;

public class MultithreadingSample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("From Main thread!!!");
        MyThread1 mt1 = new MyThread1();
        mt1.start();//created as separate thread
        MyThread1 mt11 = new MyThread1();
        mt11.start();
        MyThread2 mt2 = new MyThread2();
        mt2.start();
        MyThread3 mt3 = new MyThread3();
        new Thread(mt3).start();


        for (int i = 301; i <= 310; i++) {
            System.out.println("Value of i from Main Thread:" + i);
            Thread.sleep(7000);

        }
    }

}

class MyThread1 extends Thread{
    public void run() {
        System.out.println("Name of MyThread1 thread:" + this.getName());
        for (int i = 101; i <= 110; i++) {
            System.out.println("Value of i from MyThread1:" + i);
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 extends Thread{
    public void run() {
        System.out.println("Name of MyThread2 thread:" + this.getName());
        for (int i = 201; i <= 210; i++) {
            System.out.println("Value of i from MyThread2:" + i);
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MyThread3 implements Runnable {
    @Override
    public void run() {
       for (int i = 701; i <= 710; i++) {
            System.out.println("Value of i from MyThread3:" + i);
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}