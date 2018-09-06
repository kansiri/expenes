package csku.Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestAccount {

    Account income ;

    @BeforeEach
    void init() {
        income = new Account(1000) ;
    }

    @Test
    public void testShowIncome() {
        assertEquals(1000 , income.getIncome());
    }

    @Test
    public void testShowDisbursement() {
        income.payMoney(400) ;
        assertEquals(400 , income.getDis());
    }

    @Test
    public void testPayMoneyLessThanIncome() {
        income.payMoney(400) ;
        assertEquals(600,income.getCountMoney());
    }


    @Test
    public void testPayMoneyGreaterThanIncome() {
        income.payMoney(1100) ;
        assertEquals(1100,income.getDis());
        assertEquals(0,income.getCountMoney());
    }

    @Test
    public void testAddIncome() {
        income.addIncome(200);
        assertEquals(1200, income.getIncome());
    }

}
