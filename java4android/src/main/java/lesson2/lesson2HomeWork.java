package lesson2;

public class lesson2HomeWork {

    public static void main(String[] args) {
        taskOne(5, 50);
        taskTwo(-125);
        taskThree(300);
        taskFour("I like Java", 9);
        taskFive(2022);

    }


    public static boolean taskOne(int a, int b){
        boolean summ = ((a + b) >= 10 && (a + b) <= 20);
        return summ;

    }

    public static void taskTwo(int c){
        if (c >= 0) {
            System.out.println(c + " Число положительное");
        } else {
            System.out.println(c + " Число отридцательное");
        }
    }

    public static boolean taskThree(int d){
        boolean bool = d < 0;
        return bool;
        // считаем ноль положительным, как в прошлом примере
    }

    public static void taskFour(String str, int count){
        while (count > 0){
            count--;
            System.out.println(str);
        }
    }

    public static boolean taskFive(int myYear) {

        if (myYear % 4 != 0 || ( myYear % 100 == 0 && myYear % 400 != 0)) {
            return false;
        } else {
            return true;
        }


    }

}
