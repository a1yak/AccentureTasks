package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {

        BankAccount acc = new BankAccount("gregory", 500);
        BankAccount acc2 = new BankAccount("gregorz", 600);

    @Test
    void withdraw400ShouldReturn100() {
        assertEquals(100, acc.withdrawMoney(acc,400));
    }

    @Test
    void withdraw1000ShouldReturnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->{
            acc.withdrawMoney(acc,1000);
        });
    }

    @Test
    void deposit100ShouldReturn600(){
        assertEquals(600, acc.depositMoney(100));
    }

    @Test
    void transfer200ShouldReturn300(){
        assertEquals(300,BankAccount.transferMoney(acc,acc2,200));
    }
}