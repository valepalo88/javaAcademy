public class ContainerNumber {
    private int number;

    public ContainerNumber(int number) {
        this.number = number;
    }

    public int getNext() {
        if (number == 0) {
            return 99;
        }
        return number - 1;
    }

    public String getAction() {
        if (number == 0)
            return "Go to the store, buy some more,";
        return "Take one down, pass it around,";
    }

    public String getContainer() {
        if (number == 1)
            return " bottle";
        return " bottles";
    }
}
