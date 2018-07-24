package ru.java.courses.accounting;

/**
 * Created by Варвара on 19.07.2018.
 */
public interface SpendingStrategy {
    double getAvailableMoney();

    boolean canSpendMoney(double money, Category category);

}
