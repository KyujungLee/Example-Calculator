package com.example.calculator1;
import java.util.Scanner;
import com.example.calculator2.Calculator;

public class Calculator1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        String operator;
        String start;
        String end;

        while (true) {
            // 첫번째 값을 입력받음
            // 첫번째 값이 "exit"라면 프로그램을 종료
            // 두번째, 세번째 값을 입력받음.
            // 3가지 입력값의 예외사항 검증
            // 예외사항이 없다면, 사칙연산 수행, 결과 출력 후 프로그램 재시작.

            int count = 0;

            System.out.println("양의 정수(0을 포함)와 연산자를, 엔터로 구분하여 입력하세요. exit를 입력하면 종료됩니다.");
            start = sc.next();
            if (start.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            operator = sc.next();
            end = sc.next();

            // 첫번째, 세번째 입력값이 숫자인지 검증, 아니라면 처음으로 돌아감.
            for (int i = 0; i < start.length(); i++) {
                if (start.charAt(i) < '0' || start.charAt(i) > '9') {
                    count++;
                    break;
                }
            }
            for (int i = 0; i < end.length(); i++) {
                if (end.charAt(i) < '0' || end.charAt(i) > '9') {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                System.out.println("올바른 숫자를 입력하세요.");
                continue;
            }

            // 첫번째, 세번째 입력값이 음의 값을 가질 경우, 처음으로 돌아감.
            num1 = Integer.parseInt(start);
            num2 = Integer.parseInt(end);
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            Calculator calculator = new Calculator(num1, num2);
            switch (operator) {
                case "+":
                    System.out.println("결과 = " + calculator.add(num1, num2));
                    break;
                case "-":
                    System.out.println("결과 = " + calculator.subtraction(num1, num2));
                    break;
                case "*":
                    System.out.println("결과 = " + calculator.multiply(num1, num2));
                    break;
                case "/":
                    System.out.println("결과 = " + calculator.divide(num1, num2));
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하세요");
                    break;
            }
        }

    }
}
