package lesson1;

public class Goblin {
    public static void main(String[] args) {
//        System.out.println("hello, world!");
//        printHelloWorld();
//        testVars();

        checkApp();


    }

    private static void testVars() {
        int varA = 9;
        int varB = 5;
        double result = varA / varB;
        //double result = varA / varB;
        long longVar = (long)10;
        System.out.println(result);


        double doubleVarA = 9.0;
        float doubleVarB = 5.2f;
        System.out.println(doubleVarA/doubleVarB);

        boolean isRed = true;
        isRed = false;

        char ch1;
        char ch2 = 9829;
        System.out.println(ch2);

        varA  = varA + 3;
        varA  += 3;

        String helloStr = "hello";
        String worldStr = "world";
        System.out.println(helloStr + " " + worldStr + "!");
        System.out.println(helloStr + " " + worldStr + "!");

    }



    public static void printHelloWorld() {
        System.out.println("Dancing on the table!");
    }

    public static void checkApp(){
        int app  = 2;
        System.out.println("школьник принес " + app);

        if (app == 5){
            System.out.println("cool");


        }else if(app ==4){
            System.out.println("not cool");
        } else if(app == 3 || app == 2 || app == 1){
        System.out.println("not cool");
        } else if(app >=1 && app <=3){
            System.out.println("not cool");
    } else {
            System.out.println("не мухлюй");
        }

        System.out.println("проверка окончена");
    }




}
