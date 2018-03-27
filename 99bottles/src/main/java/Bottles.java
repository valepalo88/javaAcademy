import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) throws FileNotFoundException {
        generateOutput(new PS(null));
    }

    private static class PS extends PrintStream {
        String totale = "";

        public PS(File file) throws FileNotFoundException {
            super(file);
        }

        @Override
        public void print(String s) {
            totale = totale + s;
        }

        @Override
        public void println(String s) {
            totale = totale + s;
        }
    }

    public static void generateOutput(PrintStream out) {
        for (int number = 99; number > -1; number--) {

            if (number == 0) {
                out.print(number + getContainer(number) + " of beer on the wall,");
                out.println(number + getContainer(number) + " of beer,");
                out.print("Go to the store, buy some more,");
                out.println("99 bottles of beer on the wall.\r\n");
            } else if (number == 1) {
                out.print(number + getContainer(number) + " of beer on the wall,");
                out.println(number + getContainer(number) + " of beer,");
                out.print("Take one down, pass it around,");
                out.println(number - 1 + getContainer(number - 1) + " of beer on the wall.\r\n");
            } else if (number == 2) {
                out.print(number + getContainer(number) + " of beer on the wall,");
                out.println(number + getContainer(number) + " of beer,");
                out.print("Take one down, pass it around,");
                out.println(number - 1 + getContainer(number - 1) + " of beer on the wall.\r\n");
            } else {
                out.print(number + getContainer(number) + " of beer on the wall,");
                out.println(number + getContainer(number) + " of beer,");
                out.print("Take one down, pass it around,");
                out.println(number - 1 + getContainer(number - 1) + " of beer on the wall.\r\n");
            }
        }
    }

    private static String getContainer(int n) {
        if (n == 1)
            return " bottle";

        return " bottles";
    }
}