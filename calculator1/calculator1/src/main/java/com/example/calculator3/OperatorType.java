package com.example.calculator3;

public enum OperatorType {
    ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");
    private String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    // 상수에 저장된 매개변수를 리턴하는 매서드
    public String getOperator() {
        return operator;
    }

    // 입력된 매개변수 operator가, OperatorType에 저장된 상수의 매개변수와 일치하는지 확인하는 매서드
    public static OperatorType operatorName(String operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.getOperator().equals(operator)) {
                return type;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자입니다: " + operator);
    }
}