package com.example.calculator1;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result;
        double resultdouble;
        int num1;
        int num2;
        String operator;
        String start;
        String end;

        while (true) {
            int count = 0;

            System.out.println("양의 정수(0을 포함)와 연산자를, 엔터로 구분하여 입력하세요. exit를 입력하면 종료됩니다.");
            start = sc.next();
            operator = sc.next();
            end = sc.next();

            // 첫번째, 세번째 입력값이 숫자인지 검증, 아니라면 처음으로 돌아감.
            // 첫번째 입력값이 "exit"인 경우 프로그램 종료.
            for (int i = 0; i < start.length(); i++) {
                if (start.charAt(i) <= '0' || start.charAt(i) >= '9') {
                    count++;
                    break;
                }
            }
            for (int i = 0; i < end.length(); i++) {
                if (end.charAt(i) <= '0' || end.charAt(i) >= '9') {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                System.out.println("올바른 숫자를 입력하세요.");
                continue;
            } else if (start.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            // 첫번째, 세번째 입력값이 음의 값을 가질 경우, 처음으로 돌아감.
            num1 = Integer.parseInt(start);
            num2 = Integer.parseInt(end);
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("결과 = " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("결과 = " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("결과 = " + result);
                    break;
                case "/":
                    // 세번째 입력값이 0일 경우, 처음으로 돌아감.
                    // 나누기 결과에 소수점이 포함되지 않는 경우 결과를 정수로 출력, 아닌경우 결과를 실수로 출력
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                    } else if (num1 > num2 && num1 % num2 == 0) {
                        result = num1 / num2;
                        System.out.println("결과 = " + result);
                    } else {
                        resultdouble = (double) num1 / num2;
                        System.out.println("결과 = " + resultdouble);
                    }
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하세요");
                    break;
            }
        }

    }
}
