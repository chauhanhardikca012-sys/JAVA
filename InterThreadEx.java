class Child {

    synchronized void show() {

        System.out.println("Thread 1 is waiting...");

        try {
            wait();  
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread 1 resumed after notify");
    }
}

class InterThreadEx {

    public static void main(String[] args) {

        Child c = new Child();

        Thread t1 = new Thread(() -> {
            c.show();   
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);   
            } catch (Exception e) {}

            synchronized (c) {
                System.out.println("Thread 2 giving notify...");
                c.notify();   
            }
        });

        t1.start();
        t2.start();
    }
}