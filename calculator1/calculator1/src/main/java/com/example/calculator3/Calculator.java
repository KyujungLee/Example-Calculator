package com.example.calculator3;

public class Calculator<T>{
    private T start;
    String operator;
    private T end;

    public Calculator(T start, String operator, T end) {
        this.start = start;
        this.operator = operator;
        this.end = end;
    }

    // 연산하는 매서드
    public double calculator(T start, String operator, T end) {

        double num1 = Double.parseDouble(start.toString());
        double num2 = Double.parseDouble(end.toString());

        OperatorType opType = OperatorType.operatorName(operator);

        return switch (opType) {
            case ADD -> num1 + num2;
            case SUBTRACT -> num1 - num2;
            case MULTIPLY -> num1 * num2;
            case DIVIDE -> num1 / num2;

        };
    }
}
