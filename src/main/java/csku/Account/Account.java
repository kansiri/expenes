package csku.Account;

public class Account {

    private int money;
    private int dis;
    private int countMoney;


    public Account(int income) {
        this.money = income;
    }

    public int payMoney(int pay) {
        dis = pay;
        if (money >= pay) {
            countMoney = money - pay;
            money -= pay;
            return countMoney;
        } else {
            money = 0;
            return money;
        }
    }

    public int addIncome(int number) {
        money += number;
        return money;
    }


    public int getIncome() {
        return money;
    }

    public int getCountMoney() {
        return countMoney;
    }

    public int getDis() {
        return dis;
    }

}