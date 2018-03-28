import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int number = 99; number > -1; number--) {
            out.print(number + container(number) + " of beer on the wall,");
            out.println(number + container(number) + " of beer,");
            out.print(action(number));
            out.println(next(number) + container(next(number)) + " of beer on the wall.\r\n");
        }
    }

    private static int next(int beers) {
        if (beers == 0)
            return 99;
        return beers - 1;
    }

    private static String action(int n) {
        if (n == 0)
            return "Go to the store, buy some more,";
        return "Take one down, pass it around,";
    }

    private static String container(int n) {
        if (n == 1)
            return " bottle";
        return " bottles";
    }
}