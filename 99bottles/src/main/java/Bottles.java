import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        generateOutput(System.out);
    }

    public static void generateOutput(PrintStream out) {
        String s = "s";
        for (int beers = 99; beers > -1; ) {
            out.print(beers + " bottle" + s + " of beer on the wall,");
            out.println(beers + " bottle" + s + " of beer,");
            if (beers == 0) {
                out.print("Go to the store, buy some more,");
                out.println("99 bottles of beer on the wall.\r\n");
                return;
            } else
                out.print("Take one down, pass it around,");
            s = (--beers == 1) ? "" : "s";
            out.println(beers + " bottle" + s + " of beer on the wall.\r\n");
        }
    }
}