import java.util.Scanner;
import java.lang.Math;

public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int d = 0;
        double num_1, num_2;
        while(true){
            System.out.print("Введите первое число: ");
            if (in.hasNextDouble()){
                num_1 = in.nextDouble();
                break;
                }
            else {
                System.out.println ("Введите число");
                in.next();
                d++;
            }
        }

        while (true){
            System.out.print("Введите второе число: ");
            if (in.hasNextDouble()){
                num_2 = in.nextDouble();
                break;
            }
            else {
                System.out.println("Введите число");
                in.next();
                d++;
            }
        }

        double result = 1;
        boolean operation_correct = false;
        in.nextLine();

        System.out.println();
        while (!operation_correct) {
            System.out.print("Введите слово или один из знаков: + - * / % ^ ^/)");
            System.out.print("\nВыберете операцию: ");
            String operation = in.nextLine();
            result = 1;

            if(operation.equals("сложение") || operation.equals("+")) {
                result = num_1 + num_2;
                operation_correct = true;
            }

            else if(operation.equals("вычитание") || operation.equals("-")) {
                result = num_1 - num_2;
                operation_correct = true;
            }

            else if(operation.equals("умножение") || operation.equals("*")) {
                result = num_1 * num_2;
                operation_correct = true;
            }

            else if(operation.equals("деление") || operation.equals("/")) {
                if(num_2 != 0) {
                    result = num_1 / num_2;
                    operation_correct = true;
                }
                else {
                    System.out.println("Деление на ноль");
                    d++;
                }
            }

            else if(operation.equals("остаток") || operation.equals("%")) {
                if (num_2 != 0) {
                    result = num_1 % num_2;
                    operation_correct = true;
                }
                else {
                    System.out.println("Остаток от нуля");
                    d++;
                }
            }

            else if(operation.equals("степень") || operation.equals("^")) {
                if (num_2 < 0) {
                    for(int i = 0; i > (int)num_2; i--) {
                        result *= 1/num_1;
                    }
                    operation_correct = true;
                }
                else if (num_2 == 0) {
                    result = 1;
                    operation_correct = true;
                }
                else if (num_2 == 1) {
                    result = num_1;
                    operation_correct = true;
                }
                else if (num_2 > 1) {
                    for(int i = 0; i < (int)num_2; i++) {
                        result *= num_1;
                    }
                    operation_correct = true;
                }
            }

            else if(operation.equals("корень") || operation.equals("^/")) {
                if (num_1 >= 0) {
                    if (num_2 > 0) {
                        result = Math.pow(num_1, 1.0 / num_2);
                        operation_correct = true;
                    }
                    else {
                        System.out.println("Степень корня должна быть положительной");
                    }
                }
                else {
                    System.out.println("Корень должен быть положительным");
                    d++;
                }
            }
            else {
                System.out.println("Введите операцию корректно!");
                d++;
            }
        }
        System.out.printf("Ваш результат равен: %.2f\n", result);
        System.out.printf("Вы допустили ошибок: %d\n", d);
        in.close();
    }
}
