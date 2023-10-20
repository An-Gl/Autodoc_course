package lessons.lesson13.enumExample;

public enum CountryCurrency {
    CANADA ("CAD"),
    POLAND ("PLN"),
    UKRAINE("UAH"),
    GERMANY;


    String currency;

    CountryCurrency(String currency) {
        this.currency = currency;
    }

    CountryCurrency() {

    }

}
