package com.middle.test.domain.primenumber;

import java.util.stream.IntStream;

public class Number {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    // 소수: 1과 자기 자신 외 나누어 떨어지지 않는 자연수
    public boolean isPrimeNumber() {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                    .noneMatch(num -> number % num == 0)
                && number != 1;
    }
}
