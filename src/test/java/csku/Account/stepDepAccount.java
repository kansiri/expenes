package csku.Account;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stepDepAccount {

    Account income ;

    @Before
    public void init() {
        income = new Account(0);
    }

    @Given("a user has (.*) baht")
    public void a_user_has_baht(int number) {
        income.addIncome(number) ;
    }

    @When("I add income (.*) baht")
    public void I_add_income_baht(int number) {
        income.addIncome(number) ;
    }

    @When("I pay a money (.*) baht")
    public void I_pay_a_money_baht(int pay) {
        income.payMoney(pay) ;
    }

    @When("I want to check my income that is (.*) baht")
    public void I_want_to_check_my_income_that_is_baht(int number) {
        assertEquals(number,income.getIncome());
    }

    @Then("I have income amount (.*) baht")
    public void I_have_income_amount_baht(int newNumber) {
        assertEquals(newNumber,income.getIncome());
    }

    @Then("I have money income amount (.*) baht")
    public void I_have_money_income_amount_baht(int number) {
        assertEquals(number,income.getIncome());
    }

    @Then("my disbursement is (.*) baht")
    public void my_disbursement_is_baht(int pay) {
        assertEquals(pay,income.getDis());
    }

    @Then("System show my income amount (.*) baht")
    public void System_show_my_income_amount_baht(int number) {
        assertEquals(number,income.getIncome());
    }

    @Then("System show disbursement amount (.*) baht")
    public void System_show_disbursement_amount_baht(int pay) {
        assertEquals(pay,income.getDis());
    }
}
