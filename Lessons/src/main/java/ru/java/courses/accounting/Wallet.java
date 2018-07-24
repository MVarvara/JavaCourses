package ru.java.courses.accounting;

/**
 * Created by Варвара on 19.07.2018.
 */
public class Wallet {
    private static Wallet instance = new Wallet();

    public static Wallet getInstance() {
        return instance;
    }

    private Wallet() {
    }

    private double money;
    private double salary;
    StandartSpendingStrategy strategy;
    private double availableInMonth;

    public StandartSpendingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(StandartSpendingStrategy strategy) {
        this.strategy = strategy;
        this.availableInMonth = strategy.getAvailableMoney();
    }

    public double getMoney() {
        return money;
    }

    public double getSalary() {
        return salary;
    }




    public void addMoney(double money){
        this.money+=money;
    }

    public void spendMoney(double money, Category category){
        if (money > this.money){
            throw new IllegalStateException("Not enough money!");
        }

        if (!(strategy.canSpendMoney(money, category))){
            throw new IllegalStateException(("Not enough money!"));
        }
        if (money > availableInMonth){
             throw new IllegalStateException("Not enough money!");
        }
        this.money-=money;
        this.availableInMonth -=money;
    }
}
