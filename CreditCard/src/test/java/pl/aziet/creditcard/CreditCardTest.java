package pl.aziet.creditcard;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {
    @Test
    void itAssignCredit() {
        //Arrange
        CreditCard card = new CreditCard();
        //Act
        card.assignCredit(BigDecimal.valueOf(1000));
        //Assert
        assert BigDecimal.valueOf(1000).equals(card.getBalance());
    }

    @Test
    void itAssignCreditV2() {
        //Arrange
        CreditCard card = new CreditCard();
        //Act
        card.assignCredit(BigDecimal.valueOf(1500));
        //Assert
        //assert BigDecimal.valueOf(1500).equals(card.getBalance());
        assertEquals(
                BigDecimal.valueOf(1500),
                card.getBalance()
        );
    }

    @Test
    void itDenyCreditBelowThresholdV1() {
        CreditCard card = new CreditCard();
        try {
            card.assignCredit(BigDecimal.valueOf(50));
            fail("Should throw exception");
        } catch (CreditBelowThresholdException e) {
            assertTrue(true);
        }
    }

    @Test
    void itDenyCreditBelowThresholdV2() {
        CreditCard card = new CreditCard();
        //python
        //java // (x) -> x + 2

        assertThrows(
                CreditBelowThresholdException.class,
                () -> card.assignCredit(BigDecimal.valueOf(10))
        );

        try {
            card.assignCredit(BigDecimal.valueOf(50));
            fail("Should throw exception");
        } catch (CreditBelowThresholdException e) {
            assertTrue(true);
        }
    }

    @Test
    void itDenyCreditReassignment() {
        CreditCard card = new CreditCard();
        card.assignCredit(BigDecimal.valueOf(1000));
        assertThrows(
                creditAlreadyAssignedException.class,
                () -> card.assignCredit(BigDecimal.valueOf(1200))
        );
    }

    @Test
    void itAllowsToPayForSomething() {

    }
}
