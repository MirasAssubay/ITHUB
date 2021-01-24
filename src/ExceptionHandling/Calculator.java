package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator extends Exception {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("-------------Assubay Miras------------------");
        System.out.println("--------------------------------------------");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1 что бы продолжить операцию, 2 что бы завершить.");
                int vvod = scanner.nextInt();
                switch (vvod) {
                    case 1:
                        System.out.println("Введите первую цифру ");
                        int a = scanner.nextInt();
                        System.out.println("Введите вторую цифру ");
                        int b = scanner.nextInt();
                        System.out.println("Введите операцию: ");
                        String function = scanner.next();
                        switch (function) {
                            case "+":
                                System.out.println("Результат: ");
                                System.out.println(a + b);
                                continue;
                            case "*":
                                System.out.println("Результат: ");
                                System.out.println(a * b);
                                continue;
                            case "-":
                                System.out.println("Результат: ");
                                System.out.println(a - b);
                                continue;
                            case "/":
                                System.out.println("Результат: ");
                                if (b == 0){
                                    throw new NumberFormatException("Нельзя делить на ноль!");
                                }
                                System.out.println(a / b);
                                continue;
                            default:
                                throw new ArithmeticException("Ошибка, операция отсутствует. Доступные операции +, -, *, /");
                        }
                    case 2:
                        System.out.println("До свидания!");
                        return;
                }
            }
            catch (InputMismatchException ime){
                System.out.println("Введите правильную переменную!");
            }
        }
    }
}
