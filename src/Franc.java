public class Franc extends Money{

    public Franc(int amount, String currency){

        super(amount, currency);
    }

    Money times(int multiplier) {

        return new Money(this.amount * multiplier, currency);
    }

}
