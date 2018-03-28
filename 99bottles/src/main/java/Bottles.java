import domain.Drink;
import domain.LastDrink;

import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int number = 99; number > -1; number--) {
            verse(out, number);
        }
    }

    private static void verse(PrintStream out, int number) {
        final Drink drink;


        if (number == 0)
            drink = new LastDrink();
        else
            drink = new Drink(number);

        out.print(drink.containerCount() + " of beer on the wall,");
        out.println(drink.containerCount() + " of beer,");
        out.print(drink.action());
        final Drink next = drink.next();
        out.println(next.containerCount() + " of beer on the wall.\r\n");
    }

}