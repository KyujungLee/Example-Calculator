package com.example.calculator2;
import java.util.Stack;

public class Calculator {

    int num1;
    int num2;
    Stack<Number> result = new Stack<>();


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add (int num1, int num2){
        result.add(num1 + num2);
        return result.peek();
    }

    public Number subtraction (int num1, int num2){
        result.add(num1 - num2);
        return result.peek();
    }

    public Number multiply (int num1, int num2){
        result.add(num1 * num2);
        return result.peek();
    }

    public Number divide (int num1, int num2){
        if (num1>=num2 && num1%num2==0) {
            result.add(num1 / num2);
        } else {
            result.add((double) num1 / num2);
        }
        return result.peek();
    }
}
