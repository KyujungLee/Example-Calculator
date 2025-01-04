package com.example.calculator2;

public class Calculator {

    double resultdouble;
    int result;
    int num1;
    int num2;
    String start;
    String operator;
    String end;

    Calculator (String start, String operator, String end) {
        this.start = start;
        this.operator = operator;
        this.end = end;
    }

    public void calculate (String start, String operator , String end){
        num1 = Integer.parseInt(start);
        num2 = Integer.parseInt(end);
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
                if ( num1 >= num2 && num1%num2==0) {
                    result = num1 / num2;
                    System.out.println("결과 = "+result);
                } else {
                    resultdouble = (double)num1/num2;
                    System.out.println("결과 = "+resultdouble);
                }
                break;
            default:
                break;
        }
    }
}
