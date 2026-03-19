class MyThread extends Thread {
    int start;

    MyThread(int s) {
        start = s;
    }

    public void run() {
        for (int i = start; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

class AlternateThread {
    public static void main(String[] args) {

        MyThread t1 = new MyThread(1); 
        MyThread t2 = new MyThread(2); 

        t1.start();
        t2.start();
    }
}