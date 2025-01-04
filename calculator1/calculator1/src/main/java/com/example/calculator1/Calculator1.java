package com.example.calculator1;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int result;
            double resultdouble;
            int num1;
            int num2;
            String operator;
            String start;

            System.out.println("양의 정수(0을 포함)와 연산자를 입력하세요. exit를 입력하면 종료됩니다.");
            start = sc.next();

            if (start.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                num1 = Integer.parseInt(start);
            }
            operator = sc.next();
            num2 = sc.nextInt();

            if ( num1 < 0 || num2 < 0) {
                System.out.println("양의 정수를 입력하세요");
                continue;
            } else {
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("결과 = "+result);
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.println("결과 = "+result);
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.println("결과 = "+result);
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요");
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
}
