package src.test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import SimpleBankingSystem.Account;


public class TestAccount {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
    }


    @Test
    void testDepositAmount_Success() throws Exception {
        account.depositAmount(500);
        assertEquals(3000, account.getBalance());
    }

    @Test
    void testDepositAmount_NegativeAmount() {
        Exception exception = assertThrows(Exception.class, () -> account.depositAmount(-100));
        assertEquals("No es pot ingressar una quantitat negativa.", exception.getMessage());
    }

    @Test
    void testWithdrawAmount_Success() throws Exception {
        account.withdrawAmount(1000);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdrawAmount_NegativeAmount() {
        Exception exception = assertThrows(Exception.class, () -> account.withdrawAmount(-500));
        assertEquals("No es pot retirar una quantitat negativa.", exception.getMessage());
    }

    @Test
    void testWithdrawAmount_InsufficientBalance() {
        Exception exception = assertThrows(Exception.class, () -> account.withdrawAmount(3000));
        assertEquals("No hi ha suficient saldo", exception.getMessage());
    }
}
