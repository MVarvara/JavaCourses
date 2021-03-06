package ru.java.courses.accounting;

/**
 * Created by Варвара on 19.07.2018.
 */
public class EconomySpendingStrategy implements SpendingStrategy {
    public static final double AVAILABLE_MONEY = 100.0;
    @Override
    public double getAvailableMoney() {
        return AVAILABLE_MONEY;
    }

    @Override
    public boolean canSpendMoney(double money, Category category) {
        if (money > AVAILABLE_MONEY){
            return false;
        }

        switch (category) {
            case FOOD:
            case DRUGS:
                return true;
            default:
                return false;
        }
    }
}
