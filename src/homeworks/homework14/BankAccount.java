package homeworks.homework14;

public class BankAccount {

    private double balance;
    private final String accountName;

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double sumOfOperation) {
        balance += sumOfOperation;
    }

    public void withdraw(double sumOfOperation) throws NegativeBalanceException, InsufficientFundsException {
        if (balance < 0) {
            throw new NegativeBalanceException(
                    "Ошибка: Отрицательный баланс не допускается");
        } else if (balance < sumOfOperation) {
            throw new InsufficientFundsException(
                    "Ошибка: Недостаточно средств на счете.");
        }
        balance -= sumOfOperation;
    }

    public void transferTo(BankAccount accountTransferTo, double sumOfOperation) throws NegativeBalanceException,
            InsufficientFundsException {
        withdraw(sumOfOperation);
        accountTransferTo.deposit(sumOfOperation);
    }

    public double getBalance() {
        return balance;
    }
}
