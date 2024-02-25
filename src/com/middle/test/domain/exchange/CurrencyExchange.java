package com.middle.test.domain.exchange;

import com.middle.test.global.utils.NumberValidator;

import java.math.BigDecimal;

public class CurrencyExchange {
    private static final BigDecimal usdExchangeRate = BigDecimal.valueOf(0.00075);
    private static final BigDecimal jpyExchangeRate = BigDecimal.valueOf(0.11);

    public void exchange(BigDecimal krw) {
        BigDecimal usd = krw.multiply(usdExchangeRate);
        BigDecimal jpy = krw.multiply(jpyExchangeRate);
        System.out.printf("달러($) = %,.2f / JPY = %.2f", usd, jpy);
    }

    public void validateKrw(String krwFormat) throws IllegalArgumentException {
        NumberValidator numberValidator = new NumberValidator();
        numberValidator.validateKrw(krwFormat);
        numberValidator.validateEmptyInputValue(krwFormat);

        String exceptionMessage = numberValidator.getMessage();
        if(exceptionMessage == null) {
            return;
        }
        throw new IllegalArgumentException(exceptionMessage);
    }
}
