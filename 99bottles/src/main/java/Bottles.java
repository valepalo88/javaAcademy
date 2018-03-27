import java.io.FileNotFoundException;
import java.io.PrintStream;

class Bottles {

    public static void main(String args[]) throws FileNotFoundException {
        generateOutput(System.out);
    }

    public static void generateOutput(PrintStream out) {

        for (int number = Verse.maxNumber; number > -1; number--) {
            Verse.getVerse(out, number);
        }
    }

}