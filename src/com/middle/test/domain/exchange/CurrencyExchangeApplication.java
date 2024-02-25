package com.middle.test.domain.exchange;

import java.math.BigDecimal;
import java.util.Scanner;

public class CurrencyExchangeApplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("환전할 원화를 입력하세요 : 원 (KRW) = ");
            String krwFormat = scanner.nextLine().trim();
            CurrencyExchange currencyExchange = new CurrencyExchange();
            currencyExchange.validateKrw(krwFormat);
            currencyExchange.exchange(new BigDecimal(krwFormat.replace(",", "")));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
