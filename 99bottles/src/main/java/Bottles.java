import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class Bottles {

    static final int maxNumber = 99;

    public static void main(String args[]) throws FileNotFoundException {
        generateOutput(System.out);
    }

    public static void generateOutput(PrintStream out) {

        for (int number = maxNumber; number > -1; number--) {

            if (number == 0) {
                out.print(number + getContainer(number) + " of " + getDrink() + " on the wall,");
                out.println(number + getContainer(number) + " of " + getDrink() + ",");
                out.print(action(number));
                out.println(remainingDrinks(number) + getContainer(remainingDrinks(number)) + " of " + getDrink() + " on the wall.\r\n");
            } else {
                out.print(number + getContainer(number) + " of " + getDrink() + " on the wall,");
                out.println(number + getContainer(number) + " of " + getDrink() + ",");
                out.print(action(number));
                out.println(remainingDrinks(number) + getContainer(remainingDrinks(number)) + " of " + getDrink() + " on the wall.\r\n");
            }
        }
    }

    private static String action(int n) {
        if (n == 0)
            return "Go to the store, buy some more,";
        return "Take one down, pass it around,";
    }

    private static int remainingDrinks(int n) {
        if (n == 0) {
            return maxNumber;
        }
        return n - 1;
    }

    private static String getDrink() {
        return "beer";
    }

    private static String getContainer(int n) {
        if (n == 1)
            return " bottle";

        return " bottles";
    }
}