package homework4;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp.printThreeWords();
        HomeWorkApp.checkSumSign();
        HomeWorkApp.printColor();
        HomeWorkApp.compareNumbers();
        HomeWorkApp.checkSum(5,0);
        HomeWorkApp.writePositiveOrNegative(-110);
        HomeWorkApp.checkPositiveOrNegative(110);
        HomeWorkApp.printSomeLines("#russiaisateroriststate",5);
        HomeWorkApp.checkIfItsALeapYear(1996);
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(){
        int a = 10;
        int b = -11;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor(){
        int value = 101500;
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <=100){
            System.out.println("Желтый");
        }else if (value > 100){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 9;
        int b = 8;
        if (a >= b){
            System.out.println("a >= b");
        }else if (a < b){
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b){
        int sum = a + b;
        if (sum <= 20 && sum >= 10){
            return true;
        }else
            return false;
    }

    public static void writePositiveOrNegative(int number){
        if (number >= 0){
            System.out.println("Число положительное");
        }else
            System.out.println("Число отрицательное");
    }

    public static boolean checkPositiveOrNegative(int number){
        boolean flag;
        if (number >= 0){
            flag = true;
        }else
            flag = false;
        return flag;
    }

    public static void printSomeLines(String someMessage, int iterations){
        for (int i = 0; i < iterations; i++) {
            System.out.println(someMessage);
        }
    }

    public static boolean checkIfItsALeapYear(int year){
        boolean flag = false;
        if (year%4 == 0){
            flag = true;
        }
        return flag;
    }
}
