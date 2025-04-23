package calculator;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("첫번재 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.println("두번재 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            scanner.nextLine();

            System.out.println("사칙연산 기호를 입력하세요: ");
            String operate = scanner.nextLine();

            if (operate.equals("+") || operate.equals("-") || operate.equals("*") || operate.equals("/")) {
                if (operate.equals("+")) {
                    int result = num1 + num2;
                    System.out.println("덧셈 결과는: " + result);
                } else if (operate.equals("-")) {
                    int result = num1 - num2;
                    System.out.println("뺄셈 결과는 = " + result);
                } else if (operate.equals("*")) {
                    int result = num1 * num2;
                    System.out.println("곱셈 결과는 = " + result);
                } else if (operate.equals("/")) {
                    if (num2 == 0) {
                        System.out.println("두번째 숫자에는 0이 들어갈 수 없습니다.");
                    } else {
                        int result = num1 / num2;
                        System.out.println("나눗셈 결과는 = " + result);
                    }
                }
            } else {
                System.out.println("사칙연산 기호를 확인하세요!");
            }

            System.out.println("더 계산하시겠습니까?");
            String close = scanner.nextLine();

            if(close.equals("exit")){
                break;
            } else continue;
        }
        while(true);
    }
}
