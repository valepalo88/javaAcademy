import java.io.PrintStream;

public class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--)
            if (beers == 0) {
                out.print(beers + " bottles" + " of beer on the wall,");
                out.println(beers + " bottles" + " of beer,");
                out.print("Go to the store, buy some more,");
                out.println("99 bottles of beer on the wall.\r\n");
            } else {
                out.print(beers + getContainer(beers) + " of beer on the wall,");
                out.println(beers + getContainer(beers) + " of beer,");
                out.print("Take one down, pass it around,");
                out.println(beers - 1 + getContainer(beers - 1) + " of beer on the wall.\r\n");
            }
    }

    public static String getContainer(int beers) {
        if (beers == 1)
            return " bottle";
        return " bottles";
    }
}
