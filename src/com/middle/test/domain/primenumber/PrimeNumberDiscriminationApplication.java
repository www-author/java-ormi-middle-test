package com.middle.test.domain.primenumber;

import com.middle.test.global.utils.NumberValidator;

import java.util.Scanner;

public class PrimeNumberDiscriminationApplication {
    public static void main(String[] args) {
        System.out.println("""
                [소수 판별 프로그램] 1 ~ 100까지 중 숫자를 입력하세요.""");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine().trim();
            runExceptionChecks(input);
            Number number = new Number(Integer.parseInt(input));
            System.out.println(number.isPrimeNumber());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void runExceptionChecks(String numberFormat) throws IllegalArgumentException {
        NumberValidator numberValidator = new NumberValidator();
        numberValidator.validateRangeOfNumber(numberFormat);
        numberValidator.validateEmptyInputValue(numberFormat);

        String exceptionMessage = numberValidator.getMessage();
        if(exceptionMessage == null) {
            return;
        }
        throw new IllegalArgumentException(exceptionMessage);
    }
}
