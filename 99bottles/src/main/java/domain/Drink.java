package domain;

public class Drink {


    private final int n;

    public int number() {
        return n;
    }

    public String containerCount() {
        return number() + container();
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
        return number() - 1;
    }

}
