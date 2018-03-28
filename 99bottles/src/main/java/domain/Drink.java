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

    protected String container() {
        return " bottles";
    }

    protected int nextNumber() {
        return n - 1;
    }

}
