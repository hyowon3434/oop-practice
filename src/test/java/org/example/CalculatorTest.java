package org.example;

import org.example.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

//
//비밀번호는 최소 8자 이상 12자 이하여야 한다.
//• 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생
//시킨다.
//• 경계조건에 대해 테스트 코드를 작성해야 한다.
public class CalculatorTest {

    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    public void additionTest(int operand1, String operator, int operand2, int result) {
        int calculateResult = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        assertThat(calculateResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult(){
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)

        );
    }

//    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.")
//    @Test
//    void calculateExceptionTest() {
//        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("0으로 나눌 수 없습니다.");
//    }

    //
//    @Test
//    void subtractionTest() {
//        int result = Calculator.calculate(1, "-", 2);
//
//        assertThat(result).isEqualTo(-1);
//    }
}
