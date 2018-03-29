import java.io.PrintStream;

public class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            out.print(beers + getContainer(beers) + " of beer on the wall,");
            out.println(beers + getContainer(beers) + " of beer,");
            out.print(getAction(beers));
            out.println(getNext(beers) + getContainer(beers - 1) + " of beer on the wall.\r\n");
        }
    }

    public static int getNext(int beers) {
        if (beers == 0) {
            return 99;
        }
        return beers - 1;
    }

    public static String getAction(int beers) {
        if (beers == 0)
            return "Go to the store, buy some more,";
        return "Take one down, pass it around,";
    }

    public static String getContainer(int beers) {
        if (beers == 1)
            return " bottle";
        return " bottles";
    }
}
