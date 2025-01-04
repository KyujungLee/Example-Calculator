package com.example.calculator2;
import java.lang.Exception;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("양의 정수(0을 포함)와 연산자를, 엔터로 구분하여 입력하세요. exit를 입력하면 종료됩니다.");
            String state="";
            String start = sc.next();
            if (start.equals("exit")) {
                break;
            }
            String operator = sc.next();
            String end = sc.next();

            Except except2 = new Except(start,operator,end);
            except2.handling(start,operator,end);

            if (state.equals("restart")) {
                continue;
            } else {
                Calculator calculator = new Calculator(start,operator,end);
                calculator.calculate(start,operator,end);
            }


        }

    }
}
