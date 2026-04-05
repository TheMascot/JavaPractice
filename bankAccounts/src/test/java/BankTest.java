import accounts.CheckingAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank = new Bank();

    @Test
    void test_AddAccount() {
        assertEquals(0, bank.getAccountList().size());
        bank.addAccount(new CheckingAccount("Max"));
        assertEquals(1, bank.getAccountList().size());
    }
}