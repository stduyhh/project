package calculator;

public class Calculator {

    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    int subtraction(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
