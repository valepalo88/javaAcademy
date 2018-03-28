package domain;

public class Drink {

    private final int n;

    public String containerCount() {
        return n + container();
    }

    public Drink(int n) {
        this.n = n;
    }

    public Drink next() {
        return new Drink(nextNumber());
    }

    public String action() {
        return "Take one down, pass it around,";
    }

    private String container() {
        if (n == 1)
            return " bottle";
        return " bottles";
    }

    private int nextNumber() {
        if (n == 0)
            return 99;
        return n - 1;
    }

    public static class LastDrink extends Drink {
        public LastDrink() {
            super(0);
        }

        @Override
        public String action() {
            return "Go to the store, buy some more,";
        }
    }
}
