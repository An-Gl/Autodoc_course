package homeworks.homework18;

public class LegalEntity extends Client{
    public LegalEntity(String accountName, double balance) {
        super(accountName, balance, "без комиссии", "комиссия 1%");
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
        double commission = sumOfOperation * 0.01;
        if (getBalance() < 0) {
            throw new NegativeBalanceException("Ошибка: Отрицательный баланс не допускается");
        } else if (getBalance() < sumOfOperation + commission) {
            throw new InsufficientFundsException("Ошибка: Недостаточно средств на счете.");
        }
        System.out.println("Сумма снятия: " + sumOfOperation + "; Комиссия: " + commission);
        setBalance(getBalance() - sumOfOperation - commission);
    }
}
