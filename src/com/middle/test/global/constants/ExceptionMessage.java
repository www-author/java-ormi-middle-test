package com.middle.test.global.constants;

public enum ExceptionMessage {
    EMPTY_VALUE("빈 값을 입력할 수 없습니다.\n"),
    INVALID_NUMBER_RANGE("입력한 숫자가 1~ 100까지의 범위에 해당하지 않습니다. \n"),
    INVALID_KRW_FORMAT("유효하지 않은 원화 형식입니다.\n");
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
