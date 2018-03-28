package domain;

public class Drink {
    private final int n;

    public Drink(int n) {
        this.n = n;
    }

    public String action() {
        if (n == 0)
            return "Go to the store, buy some more,";
        return "Take one down, pass it around,";
    }

    public String container() {
        if (n == 1)
            return " bottle";
        return " bottles";
    }

    public int next() {
        if (n == 0)
            return 99;
        return n - 1;
    }
}
