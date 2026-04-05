package accounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    SavingsAccount account = new SavingsAccount("Max");

    @Test
    void test_ApplyInterest() {
        account.setBalance(100);
        account.applyInterest();
        assertEquals(105, account.getBalance());
    }
}