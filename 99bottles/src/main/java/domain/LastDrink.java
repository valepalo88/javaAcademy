package domain;

public class LastDrink extends Drink {
    public LastDrink() {
        super(0);
    }

    @Override
    public String action() {
        return "Go to the store, buy some more,";
    }

    @Override
    protected int nextNumber() {
        return 99;
    }
}
