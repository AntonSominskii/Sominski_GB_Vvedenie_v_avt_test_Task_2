package org.max.home;

/**
 * Счет, входит в портфолио имеет стоимость
 */
public class Account implements IElement{

    private Long sum;

    public Account(Long sum) {
        if (sum < 0) {
            throw new IllegalArgumentException("Account sum cannot be negative.");
        }
        this.sum = sum;
    }

    @Override
    public Long getSum() {
        return sum;
    }
}