package homeworks.homework18;

public class Launcher {
    public static void main(String[] args) {
        Client individual = new Individual("Glovatska Anna", 2500);
        Client legalEntity = new LegalEntity("Lucky SE", 5600);
        Client individualEntrepreneur = new IndividualEntrepreneur("FOP Glovatska", 3700);

        individual.getInfoAboutAccount();
        try {
            individual.replenishmentOfAccount(300);
        } catch (IllegalSumOfOperationException e) {
            e.printStackTrace();
        }
        System.out.println("Баланс после пополнения: " + individual.getBalance()); //проверка
        try {
            individual.withdrawalFromAccount(2850);
        } catch (NegativeBalanceException | InsufficientFundsException | IllegalSumOfOperationException e) {
            e.printStackTrace();
        }
        System.out.println("Баланс после снятия: " + individual.getBalance()); //проверка
        System.out.println("-------------------------------------------------------");

        legalEntity.getInfoAboutAccount();
        try {
            legalEntity.replenishmentOfAccount(150);
        } catch (IllegalSumOfOperationException e) {
            e.printStackTrace();
        }
        System.out.println("Баланс после пополнения: " + legalEntity.getBalance()); //проверка
        try {
            legalEntity.withdrawalFromAccount(600);
        } catch (IllegalSumOfOperationException | NegativeBalanceException | InsufficientFundsException e) {
            e.printStackTrace();
        }
        System.out.println("Баланс после снятия: " + legalEntity.getBalance()); //проверка
        System.out.println("-------------------------------------------------------");

        individualEntrepreneur.getInfoAboutAccount();
        try {
            individualEntrepreneur.replenishmentOfAccount(1500);
        } catch (IllegalSumOfOperationException e) {
            e.printStackTrace();
        }
        System.out.println("Баланс после пополнения: " + individualEntrepreneur.getBalance()); //проверка
        try {
            individualEntrepreneur.withdrawalFromAccount(450);
        } catch (IllegalSumOfOperationException | NegativeBalanceException | InsufficientFundsException e) {
            e.printStackTrace();
        }
        System.out.println("Баланс после снятия: " + individualEntrepreneur.getBalance()); //проверка
        System.out.println("-------------------------------------------------------");
    }
}
