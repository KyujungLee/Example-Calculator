package com.example.calculator2;

public class Except {

    String start;
    String operator;
    String end;
    int count=0;
    String state = "";
    int num1;
    int num2;

    Except (String start,String operator,String end){
        this.start = start;
        this.operator = operator;
        this.end = end;
    }

    String handling(String start, String operator, String end){
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
            state = "restart";
            return state;
        } else if (!operator.equals("+") && !operator.equals("-")&&
                !operator.equals("*") && !operator.equals("/")) {
            System.out.println("올바른 연산자를 입력하세요");
            state = "restart";
            return state;
        } else {
            num1 = Integer.parseInt(start);
            num2 = Integer.parseInt(end);
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                state = "restart";
                return state;
            } else if(num2==0){
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                state = "restart";
                return state;
            } else {
                return state;
            }
        }
    }

}
