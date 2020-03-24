public class Money implements MExpression {

    protected int amount;
    protected String currency;


    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {

        return new Money(this.amount * multiplier, currency);
    }

    MExpression plus(Money addend) {


        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {

        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    public boolean equals(Object object) {

        Money money = (Money) object;
        return this.amount == money.amount && currency().equals(money.currency());
    }

    String currency() {
        return currency;
    }


    public String toString() {

        return amount + " " + currency;
    }
}

