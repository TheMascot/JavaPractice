import accounts.CheckingAccount;
import accounts.SavingsAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    Bank bank;

    @BeforeEach
    void setup(){
        bank = new Bank();
        String[] inputCreate = {"create", "checking" , "Alice"};
        BankService.bankService(inputCreate, bank);
    }

    @Test
    void test_BankServiceAddSavingsAccount() {
        String[] input = {"create", "savings" , "Alice"};
        assertEquals(1, bank.getAccountList().size());
        BankService.bankService(input, bank);
        assertEquals(2, bank.getAccountList().size());
        assertInstanceOf(SavingsAccount.class, bank.getAccountList().get(1));

    }

    @Test
    void test_BankServiceAddCheckingAccount() {
        String[] input = {"create", "checking" , "Alice"};
        assertEquals(1, bank.getAccountList().size());
        BankService.bankService(input, bank);
        assertEquals(2, bank.getAccountList().size());
        assertInstanceOf(CheckingAccount.class, bank.getAccountList().get(1));
    }


    @Test
    void test_BankServiceDeposit() {
        String[] inputDeposit = {"deposit", "Alice", "100"};
        BankService.bankService(inputDeposit, bank);
        assertEquals(100, bank.getAccountList().getFirst().getBalance());
    }

    @Test
    void test_BankServiceWithdraw() {
        String[] inputDeposit = {"withdraw", "Alice", "100"};
        BankService.bankService(inputDeposit, bank);
        assertEquals(-100, bank.getAccountList().getFirst().getBalance());
    }
    @Test
    void test_BankServiceInterestOnCheckingAccount() {
        String[] inputDeposit = {"deposit", "Alice", "100"};
        BankService.bankService(inputDeposit, bank);
        String[] inputInterest = {"interest", "Alice"};
        BankService.bankService(inputInterest, bank);
        assertEquals(101, bank.getAccountList().getFirst().getBalance());
    }
    @Test
    void test_BankServiceInterestOnSavingsAccount() {
        String[] inputCreate = {"create", "savings" , "Bob"};
        BankService.bankService(inputCreate, bank);
        String[] inputDeposit = {"deposit", "Bob", "100"};
        BankService.bankService(inputDeposit, bank);
        String[] inputInterest = {"interest", "Bob"};
        BankService.bankService(inputInterest, bank);
        assertEquals(105, bank.getAccountList().get(1).getBalance());
    }
}