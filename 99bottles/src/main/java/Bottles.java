import domain.Drink;

import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int number = 99; number > -1; number--) {
            out.print(number + new Drink(number).container() + " of beer on the wall,");
            out.println(number + new Drink(number).container() + " of beer,");
            out.print(new Drink(number).action());
            out.println(new Drink(number).next() + new Drink(new Drink(number).next()).container() + " of beer on the wall.\r\n");
        }
    }

}