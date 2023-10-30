package homeworks.homework18;

public class IndividualEntrepreneur extends Client{
    public IndividualEntrepreneur(String accountName, double balance) {
        super(accountName, balance, "комиссия 1%, если сумма меньше 1000, если больше - 0.5%",
                "без комиссии");
    }

    @Override
    public void replenishmentOfAccount(double sumOfOperation) throws IllegalSumOfOperationException {
        double commission;
        if (sumOfOperation > 0 && sumOfOperation < 1000) {
            commission = sumOfOperation * 0.01;
        } else  if ( sumOfOperation >= 1000){
            commission = sumOfOperation * 0.005;
        } else {
            throw new IllegalSumOfOperationException("Ошибка: Недопустимая сумма операции");
        }
        System.out.println("Сумма пополнения: " + sumOfOperation + "; Комиссия: " + commission);
        setBalance(getBalance() + sumOfOperation - commission);
    }

    @Override
    public void withdrawalFromAccount(double sumOfOperation) throws NegativeBalanceException, InsufficientFundsException,
            IllegalSumOfOperationException {
        if (sumOfOperation < 0 ) {
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
