package ru.java.courses.accounting;

/**
 * Created by Варвара on 19.07.2018.
 */
public class LuxurySpendingStrategy implements SpendingStrategy {
    private Wallet wallet = Wallet.getInstance();
    @Override
    public double getAvailableMoney() {
        return wallet.getMoney();
    }

    @Override
    public boolean canSpendMoney(double money, Category category) {
        if (money > getAvailableMoney()){
            return true;
        }
        return false;

    }
}
