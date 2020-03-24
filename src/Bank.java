public class Bank {

    Money reduce(MExpression source, String to) {

        if(source instanceof Money)
            return (Money) source;

        Sum sum =  (Sum) source;
        return sum.reduce(to);
    }
}
