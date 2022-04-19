package lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class WhileTest {
    public static void main(String[] args) {
        int countApple = 20;

        while (countApple > 0) {
            countApple = eatApple(countApple);

            System.out.println("Яблок стало меньше, осталось" + countApple);
        }

    }
        private static int eatApple(int countApple){

        return countApple - ThreadLocalRandom.current().nextInt(5);
    }
}

