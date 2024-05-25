import java.util.Scanner;
import static java.lang.System.in;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(in);
        System.out.println("""
                Калькулятор работает только с арабской или римской системой счисления
                Калькулятор принимает только целые числа от 1 до 10 включительно
                Умеет складывать(+), вычитать(-), умножать(*) и делить(/)
                Введенное выражение должно соответствовать одному из форматов a+b, a-b, a*b, a/b
                Приятного использования!""");
        System.out.println("Введите выражение");
        String expression = scanner.nextLine();
        System.out.println(calc(expression));
        scanner.close();

    }



    public static String calc(String input) throws Exception {

        CalcTools calcTools = new CalcTools();

        String result;
        char operator;
        String operand_a;
        String operand_b;
        boolean limitedVersion = true;

        operator = calcTools.definitionOperator(input);
        operand_a = input.split("["+operator+"]")[0];
        operand_b = input.split("["+operator+"]")[1];
        result = calcTools.arithmetic(operand_a, operand_b, operator, limitedVersion);
        return result;
    }

}