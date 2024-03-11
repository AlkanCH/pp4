package pl.aziet.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal creditLimit;

    private static boolean isCreditBelowThreshold(BigDecimal creditLimit) {
        return BigDecimal.valueOf(100).compareTo(creditLimit) > 0;
    }

    public BigDecimal getBalance() {
        return creditLimit;
    }

    public void assignCredit(BigDecimal creditLimit) {
        if (isCreditAlreadyAssigned()) {
            throw new creditAlreadyAssignedException();
        }

        if (isCreditBelowThreshold(creditLimit)) {
            throw new CreditBelowThresholdException();
        }

        this.creditLimit = creditLimit;
    }

    private boolean isCreditAlreadyAssigned() {
        return this.creditLimit != null;
    }
}
