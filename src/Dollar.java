public class Dollar extends Money{

    public Dollar(int amount, String currency){

        super(amount, currency);
    }

    Money times(int multiplier) {

        return new Dollar(this.amount * multiplier, currency);
    }
}
