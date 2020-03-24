public class Sum implements MExpression {

    MExpression augend;
    MExpression addend;

    Sum(MExpression augend, MExpression addend) {

        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce (Bank bank, String to) {

        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    public MExpression plus(MExpression addend) {
        return null;
    }
}
