public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Создаю потоки. . .");

        ThreadGroup mainGroup = new ThreadGroup("main group");

        MyThread thread1 = new MyThread(mainGroup,"поток 1");
        MyThread thread2 = new MyThread(mainGroup,"поток 2");
        MyThread thread3 = new MyThread(mainGroup,"поток 3");
        MyThread thread4 = new MyThread(mainGroup,"поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);

        System.out.println("Завершаю все потоки.");

        mainGroup.interrupt();
    }
}