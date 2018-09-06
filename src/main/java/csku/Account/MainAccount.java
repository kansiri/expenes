package csku.Account;

public class MainAccount {

    public static void main(String[] args) {


        Account m = new Account(1000);

        System.out.println(m.getIncome());

        m.payMoney(1500);

        System.out.println(m.getDis());

        System.out.println(m.getIncome());

    }
}
