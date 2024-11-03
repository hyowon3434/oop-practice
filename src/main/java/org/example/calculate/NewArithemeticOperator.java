package org.example.calculate;

public interface NewArithemeticOperator {

    boolean supports(String operator);
    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
