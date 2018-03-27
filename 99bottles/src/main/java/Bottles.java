import java.io.FileNotFoundException;
import java.io.PrintStream;

class Bottles {

    public static void main(String args[]) throws FileNotFoundException {
        generateOutput(System.out);
    }

    static void generateOutput(PrintStream ps) {

        Song song = new Song(99);
        ps.print( song.lyrics());
    }

}