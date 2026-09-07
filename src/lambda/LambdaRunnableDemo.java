package lambda;

public class LambdaRunnableDemo {

    public static void main(String[] args) {

        Runnable runnable = () -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + ": Hello");
            }

            System.out.println("Worker Thread : "
                    + Thread.currentThread().getName());
        };

        // Creating a thread with Runnable task and custom name
        Thread thread = new Thread(runnable, "Student-Worker");

        System.out.println("Main Thread : "
                + Thread.currentThread().getName());

        thread.start();

        System.out.println("Worker Thread State : "
                + thread.getState());
    }
}