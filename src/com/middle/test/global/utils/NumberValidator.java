package com.middle.test.global.utils;

import static com.middle.test.global.constants.ExceptionMessage.*;


public class NumberValidator {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void validateEmptyInputValue(String input) {
        if (input.isEmpty()) {
            setMessage(EMPTY_VALUE.getMessage());
        }
    }

    public void validateRangeOfNumber(String number) {
        String regex = "^(?:[1-9][0-9]?|100)$";
        if (!number.matches(regex)) {
            setMessage(INVALID_NUMBER_RANGE.getMessage());
        }
    }

    public void validateKrw(String input) {
        String regex = "^\\d+(,\\d{3})*(\\.\\d{1,2})?$";
        if (!input.matches(regex)) {
            setMessage(INVALID_KRW_FORMAT.getMessage());
        }
    }
}