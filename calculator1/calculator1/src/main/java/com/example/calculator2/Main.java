package com.example.calculator2;
import java.lang.Exception;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            // 첫번째 값을 입력받음
            // 첫번째 값이 "exit"라면 프로그램을 종료
            // 두번째, 세번째 값을 입력받음.
            // 3가지 입력값을 Except.handling() 매서드를 통해 예외사항 검증
            // execpt.handling 매서드의 리턴값 state가 "restart"라면, 프로그램 재시작
            // 예외사항이 없다면, 사칙연산 수행, 결과 출력 후 프로그램 재시작.

            System.out.println("양의 정수(0을 포함)와 연산자를, 엔터로 구분하여 입력하세요. exit를 입력하면 종료됩니다.");
            String state="";
            String start = sc.next();
            if (start.equals("exit")) {
                break;
            }
            String operator = sc.next();
            String end = sc.next();

            Except except = new Except(start,operator,end);
            except.handling(start,operator,end);

            if (state.equals("restart")) {
                continue;
            } else {
                int num1 = Integer.parseInt(start);
                int num2 = Integer.parseInt(end);
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
                        break;
                }

            }


        }

    }
}
