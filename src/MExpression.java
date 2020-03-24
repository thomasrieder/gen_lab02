public interface MExpression {

    Money reduce(Bank bank, String to);
    MExpression plus (MExpression addend);
}
