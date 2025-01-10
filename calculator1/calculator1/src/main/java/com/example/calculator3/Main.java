package com.example.calculator3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n[숫자와 연산자를, 엔터로 구분하여 입력하세요. exit를 입력하면 종료됩니다.]");

            // 입력된 변수를 하나하나 검증.
            System.out.print("첫번째 숫자 : ");
            String start = sc.next();
            if(Except.isExit(start)) {
                break;
            }
            if(!Except.isNumeric(start)) {
                System.out.println("\n\n*** 올바른 숫자를 입력하세요. *** ");
                continue;
            }
            System.out.print("연산자 : ");
            String operator = sc.next();
            if(Except.isExit(operator)) {
                break;
            }
            if(!Except.isOperator(operator)) {
                System.out.println("\n\n*** 올바른 연산자를 입력하세요. *** ");
                continue;
            }
            System.out.print("두번째 숫자 : ");
            String end = sc.next();
            if(Except.isExit(end)) {
                break;
            }
            if(!Except.isNumeric(end)) {
                System.out.println("\n\n*** 올바른 숫자를 입력하세요. *** ");
                continue;
            } else if(Double.parseDouble(end) == 0) {
                System.out.println("\n\n*** 0으로 나눌 수 없습니다. *** ");
                continue;
            }

            // 검증이 끝난 후, 연산진행
            Calculator<String> calculator = new Calculator<>(start, operator, end);
            double result = calculator.calculator(start, operator, end);

            System.out.println("\n결과 = " + result);

        }

    }
}


