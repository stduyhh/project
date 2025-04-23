package calculator;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        scanner.nextLine();

        Calculator calculator = new Calculator(num1, num2);

        System.out.println("사칙연산 기호를 입력하세요: ");
        String operate = scanner.nextLine();

        if(operate.equals("+")) {
            int result = calculator.add(num1, num2);
            System.out.println("덧셈 결과는: " + result);
        } else if(operate.equals("-")) {
            int result = calculator.subtraction(num1, num2);
            System.out.println("뺄셈 결과는: " + result);
        } else if(operate.equals("*")){
            int result = calculator.multiply(num1, num2);
            System.out.println("곱셈 결과는: " + result);
        } else if(operate.equals("/")){
            int result = calculator.divide(num1, num2);
            System.out.println("나눗셈 결과는: " + result);
        }
    }
}
