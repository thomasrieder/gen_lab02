public class Franc extends Money{

    public Franc(int amount){

        this.amount = amount;
    }

    Franc times(int multiplier) {

        return new Franc(this.amount * multiplier);
    }

    public boolean equals(Object object) {

        Franc franc = (Franc) object;
        return this.amount == franc.amount;
    }
}
