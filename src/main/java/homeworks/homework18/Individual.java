package homeworks.homework18;

public class Individual extends Client {
    public Individual(String accountName, double balance) {
        super(accountName, balance, "без комиссии", "без комиссии");
    }

    @Override
    public void replenishmentOfAccount(double sumOfOperation) throws IllegalSumOfOperationException {
        if (sumOfOperation < 0) {
            throw new IllegalSumOfOperationException("Ошибка: Недопустимая сумма операции");
        }
        System.out.println("Сумма пополнения: " + sumOfOperation);
        setBalance(getBalance() + sumOfOperation);
    }

    @Override
    public void withdrawalFromAccount(double sumOfOperation) throws NegativeBalanceException, InsufficientFundsException,
            IllegalSumOfOperationException {
        if (sumOfOperation < 0) {
            throw new IllegalSumOfOperationException("Ошибка: Недопустимая сумма операции");
        }
        if (getBalance() < 0) {
            throw new NegativeBalanceException("Ошибка: Отрицательный баланс не допускается");
        } else if (getBalance() < sumOfOperation) {
            throw new InsufficientFundsException("Ошибка: Недостаточно средств на счете.");
        }
        System.out.println("Сумма снятия: " + sumOfOperation);
        setBalance(getBalance() - sumOfOperation);
    }
}
