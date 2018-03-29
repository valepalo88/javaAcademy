import java.io.PrintStream;

public class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            ContainerNumber containerNumber = new ContainerNumber(beers);
            final ContainerNumber nextContainer = new ContainerNumber(beers - 1);
            out.print(beers + containerNumber.getContainer() + " of beer on the wall,");
            out.println(beers + containerNumber.getContainer() + " of beer,");
            out.print(containerNumber.getAction());
            out.println(containerNumber.getNext() + nextContainer.getContainer() + " of beer on the wall.\r\n");
        }
    }


}
