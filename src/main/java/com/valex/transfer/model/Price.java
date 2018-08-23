package com.valex.transfer.model;

import java.math.BigDecimal;

/**
 * Created by user on 8/23/18.
 */
public class Price {
    private BigDecimal amount;
    private String currency;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
