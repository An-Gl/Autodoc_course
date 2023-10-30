package homeworks.homework18;

public abstract class Client {
    private final String accountName;
    private double balance;
    private String replenishmentCondition;
    private String withdrawalCondition;

    public Client(String accountName, double balance, String replenishmentCondition, String withdrawalCondition) {
        this.accountName = accountName;
        this.balance = balance;
        this.replenishmentCondition = replenishmentCondition;
        this.withdrawalCondition = withdrawalCondition;
    }

    public void getInfoAboutAccount(){
        System.out.println("Текущий клиент: " + accountName);
        System.out.println("Условия пополнения: " + replenishmentCondition);
        System.out.println("Условия снятия: " + withdrawalCondition);
        System.out.println("Текущий баланс: " + balance);
    }
    public abstract void replenishmentOfAccount(double sumOfOperation) throws IllegalSumOfOperationException;
    public abstract void withdrawalFromAccount (double sumOfOperation) throws NegativeBalanceException, InsufficientFundsException, IllegalSumOfOperationException;
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
