package domain;

public class SingleDrink extends Drink {
    public SingleDrink() {
        super(1);
    }

    @Override
    protected String container() {
        return " bottle";
    }
}
