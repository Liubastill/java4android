package lesson2;

public class LessonCycle {
    public static void main(String[] args) {
/*
        int l = 3;
        for (int i = 0; i < 10; i++) {
            l *=3;
            System.out.println(l);

        }
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }
*/

       /* for ( ; ; ) зацыкливание {
            System.out.println("j");

        }*/

       /* final int LIMIT_OF_CYCLE = 10;
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
//                System.out.println("i = " + i + ", j = "+ j);
                System.out.print("# ");
            }
            System.out.println();
        }
        String str = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                str += "☺ ";
            } else {
                str += "☻ ";
            }
            System.out.print(str);


            for (int j = 0; j < LIMIT_OF_CYCLE - 1- i; j++) {
                System.out.print("○ ");
            }
            System.out.println();

        }*/

        for (int i = 0; i < 20; i++) {

            if (i == 10){
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(" i : " + i);
        }
        System.out.println(" END");
    }


}
