package nextstep.fp;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }

    public static int sumAll(List<Integer> numbers) {
        AtomicInteger total = new AtomicInteger();
        numbers.forEach(number -> total.addAndGet(number));
        return total.get();
    }

    public static int sumAllConditional(List<Integer> numbers, Conditional c) {
        AtomicInteger total = new AtomicInteger();
        numbers.forEach(number -> {
            if (c.validate(number)) {
                total.addAndGet(number);
            }
        });
        return total.get();
    }
}
