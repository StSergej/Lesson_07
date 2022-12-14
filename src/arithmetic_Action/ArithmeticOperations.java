package arithmetic_Action;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator{
    int num1, num2;

    public int add() {
        return num1 + num2;
    }
    public int sub() {
        return num1 - num2;
    }
    public int mul() {
        return num1 * num2;
    }
    public int div() throws ArithmeticException {
        return num1 / num2;
    }
}

public class ArithmeticOperations {
    public static void main(String[] args) {


        System.out.print("Введите число: ");
        Scanner scn = new Scanner(System.in);
        int variable1;
        try {
            variable1 = scn.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверный знак!Попробуйте еще раз.");
            return;
        }

        System.out.print("Введите число: ");
        int variable2;
        try {
            variable2 = scn.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверный знак!Попробуйте еще раз.");
            return;
        }

        Calculator action = new Calculator();
        action.num1 = variable1;
        action.num2 = variable2;

        System.out.print("Введите знак операции +, -, *, / : ");
        String operation = scn.next();

        switch (operation) {
            case "+":
                System.out.println(variable1 + " + " + variable2 + " = " + action.add());
                break;
            case "-":
                System.out.println(variable1 + " - " + variable2 + " = " +action.sub());
                break;
            case "*":
                System.out.println(variable1 + " * " + variable2 + " = " +action.mul());
                break;
            case "/":
                try {
                    System.out.println(variable1 + " / " + variable2 + " = " + action.div());
                } catch (ArithmeticException e) {
                    System.err.println("Делить на " + variable2 + " нельзя!");
                }
                break;
            default:
                System.out.println("Вы ввели неверный знак операции!");
        }
    }//main
}//class
