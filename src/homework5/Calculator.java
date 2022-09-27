package homework5;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readCommand();
        int firstOperand = getInt();
        int secondOperand = getInt();
        char operation = getOperation();
        int result = calc(firstOperand,secondOperand,operation);
        System.out.println("Результат операции: " + result);
    }

    private static void readCommand() {
        System.out.println("Введите команду:");
        String command = scanner.nextLine();
        if(command.equals("exit")){
            System.exit(0);
        }
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("При вводе числа допущена ошибка. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("При вводе операции допущена ошибка. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int firstOperand, int secondOperand, char operation){
        int result;
        switch (operation){
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                result = firstOperand / secondOperand;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(firstOperand, secondOperand, getOperation());
        }
        return result;
    }
}
