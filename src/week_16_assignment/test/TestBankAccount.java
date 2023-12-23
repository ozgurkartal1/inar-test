package week_16_assignment.test;

import org.junit.jupiter.api.Test;
import week_16_assignment.java.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBankAccount {
   BankAccount bankAccount = new BankAccount();
    @Test
    void testDepositToBankAccount(){
        bankAccount.deposit(150);
        assertEquals(bankAccount.getBalance(), 150);
    }

    @Test
    void testWithdrawWithSufficientAmountFromBankAccount(){
        bankAccount.deposit(150);
        bankAccount.withdraw(100);
        assertEquals(bankAccount.getBalance(), 50);
    }

    @Test
    void testWithdrawFromAccountExceedingBalance(){
        bankAccount.deposit(100);
        assertThrows(IllegalArgumentException.class, ()->{
            bankAccount.withdraw(120);
        });
    }

    @Test
    void testDepositNegativeAmount(){
        assertThrows(IllegalArgumentException.class, ()->{
           bankAccount.deposit(-1);
        });
    }

    @Test
    void testTransactionHistory(){
        bankAccount.deposit(100);
        assertEquals("Deposited: $100.0", bankAccount.getAccountHistory());
    }

    @Test
    void testWithdrawNegativeAmount(){
        bankAccount.deposit(3);
        assertThrows(IllegalArgumentException.class, ()->{
           bankAccount.withdraw(-1);
        });
    }
}
