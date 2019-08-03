package pl.sda.filewriter;


public class App {

    static class Task1 implements Runnable {

        @Override
        public void run() {
//           FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();

            SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;

           fileWriterSingleton.write("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "plik.temp");
            System.out.println(fileWriterSingleton);
        }
    }

    static class Task2 implements Runnable {

        @Override
        public void run() {
//            FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();

            SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;
            fileWriterSingleton.write("fffffffffffffffffffffffff", "plik.temp");
            System.out.println(fileWriterSingleton);
        }


    }

    static class Task3 implements Runnable {

        @Override
        public void run() {
//            FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();

            SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;
            fileWriterSingleton.write("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "plik.temp");
            System.out.println(fileWriterSingleton);
        }
    }

    static class Task4 implements Runnable {


        @Override
        public void run() {
//            FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();

            SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;
            fileWriterSingleton.write("lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll", "plik.temp");
            System.out.println(fileWriterSingleton);

        }
    }

    public static void main(String[] args) {



        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();


        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        
//        FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
//        FileWriterSingleton fileWriterSingleton2 = FileWriterSingleton.getInstance();
//        FileWriterSingleton fileWriterSingleton3 = FileWriterSingleton.getInstance();
//
//        System.out.println(fileWriterSingleton);
//        System.out.println(fileWriterSingleton2);
//        System.out.println(fileWriterSingleton3);

    }
}
