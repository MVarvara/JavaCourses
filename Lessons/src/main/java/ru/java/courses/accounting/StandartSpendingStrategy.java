package ru.java.courses.accounting;

/**
 * Created by Варвара on 19.07.2018.
 */
public class StandartSpendingStrategy implements SpendingStrategy {
    private Wallet wallet = Wallet.getInstance();
    @Override
    public double getAvailableMoney() {
        return wallet.getSalary()*0.5;
    }

    @Override
    public boolean canSpendMoney(double money, Category category) {
        if (money > getAvailableMoney()){
            return false;
        }

        switch (category) {
            case FOOD:
            case PETS:
            case CLOTHES:
            case DRUGS:
                return true;
            default:
                return false;
        }
    }
}
