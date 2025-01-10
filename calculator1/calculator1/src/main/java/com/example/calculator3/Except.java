package com.example.calculator3;

public class Except {

    // 입력받은 input이 숫자인지, 혹은 "exit"인지, 혹은 enum에 저장된 상수의 매개변수와 일치하는지 검증.
    public static boolean isOperator (String input) {
        for (OperatorType type : OperatorType.values()) {
            if(input.equals(type.getOperator())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumeric (String input) {
        return input.chars().allMatch(Character::isDigit);
    }

    public static boolean isExit (String input) {
        return input.equalsIgnoreCase("exit");
    }

}
