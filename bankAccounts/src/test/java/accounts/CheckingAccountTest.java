package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckingAccountTest {

    CheckingAccount account = new CheckingAccount("Max");

    @BeforeEach
    void setup(){
        account.deposit(100);
    }

    @Test
    void test_Deposit(){
        account.deposit(125.25);
        Assertions.assertEquals(225.25, account.getBalance());
    }

     @Test
    void test_Withdraw() {
        account.withdraw(50);
         Assertions.assertEquals(50.0, account.getBalance());
    }

    @Test
    void test_SetBalance() {
        account.setBalance(155.55);
        Assertions.assertEquals(155.55, account.getBalance());

    }
    @Test
    void test_ApplyInterest() {
        account.applyInterest();
        Assertions.assertEquals(101, account.getBalance());

    }
}