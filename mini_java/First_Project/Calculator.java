import java.util.Scanner;
import java.lang.Math;

public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int error_count = 0;
        int max_history = 14;
        int history_index = 0;
        String history[] = new String[max_history];
        boolean bool_num_1 = true;
        boolean bool_num_2 = true;

        boolean continue_calculation = true;

        while(continue_calculation) {

            double num_1 = 0;
            boolean valid_num_1 = true;

            while(valid_num_1){

                System.out.print("Введите первое число: ");
                if (in.hasNextDouble()){
                    num_1 = in.nextDouble();
                    valid_num_1 = false;
                    }
                else {
                    System.out.println ("Ошибка! Введите первое число повторно.");
                    in.next();
                    error_count++;
                }
            }

            double num_2 = 0;
            boolean valid_num_2 = true;
            while (valid_num_2){

                System.out.print("Введите второе число: ");
                if (in.hasNextDouble()){
                    num_2 = in.nextDouble();
                    valid_num_2 = false;
                }
                else {
                    System.out.println("Ошибка! Введите второе число повторно.");
                    in.next();
                    error_count++;
                }
            }

            in.nextLine();

            double result = 0;
            boolean operation_correct;
            String operation_symbol = "";
            operation_correct = false;

            System.out.println("\n" + "-".repeat(40));

            while (!operation_correct) {

                System.out.print("Доступные операции:\n");
                System.out.println("'+' или 'сложение'  - сложение");
                System.out.println("'-' или 'вычитание'  - вычитание");
                System.out.println("'*' или 'умножение'  - умножение");
                System.out.println("'/' или 'деление'  - деление");
                System.out.println("'%' или 'остаток'  - остаток от деления");
                System.out.println("'^' или 'степень'  - степень числа");
                System.out.println("'^/' или 'корень'  - корень");
                System.out.print("\nВыберете операцию: ");
                String operation = in.nextLine();
                operation_symbol = operation;

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
                        error_count++;
                    }
                }

                else if(operation.equals("остаток") || operation.equals("%")) {
                    if (num_2 != 0) {
                        result = num_1 % num_2;
                        operation_correct = true;
                    }
                    else {
                        System.out.println("Остаток от нуля");
                        error_count++;
                    }
                }

                else if(operation.equals("степень") || operation.equals("^")) {
                    double temp_result = 1;
                    if (num_2 < 0) {
                        for(int i = 0; i > (int)num_2; i--) {
                            temp_result *= 1/num_1;
                        }
                        result = temp_result;
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
                            temp_result *= num_1;
                        }
                        result = temp_result;
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
                        error_count++;
                    }
                }
                else {
                    System.out.println("Введите операцию корректно!");
                    error_count++;
                }
            }

            System.out.println("\n" + "-".repeat(40));
            System.out.printf("Ваш результат равен: %.2f %s %.2f = %.2f\n", num_1, operation_symbol, num_2, result);
            System.out.printf("Вы допустили ошибок: %d\n", error_count);

            if (history_index < max_history) {
                history[history_index] = String.format("%.2f %s %.2f = %.2f", num_1, operation_symbol, num_2, result);
                history_index++;
            }
            else {
                for (int n = 0; n < max_history - 1; n++) {
                    history[n] = history[n + 1];
                }
                history[max_history - 1] = String.format("%.2f %s %.2f = %.2f", num_1, operation_symbol, num_2, result);
            }

            System.out.println("\n-----История операций-----");

            if (history_index == 0) {
                System.out.println("История пуста");
            }
            else {
                for (int i = 0; i < history_index; i++) {
                    System.out.println((i + 1) + ". " + history[i]);
                }
            }

            System.out.println("\n" + "-".repeat(40));
            System.out.println("Выйти из калькулятора? ('да' или 'нет')");
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("да")) {
                continue_calculation = false;
                System.out.println("Спасибо за использование калькулятора <3");
            }
            else {
                System.out.println("\n" + "-".repeat(40));
            }
        }
    in.close();
    }
}
