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



    public static class ContainerNumber {
        private int number;

        public ContainerNumber(int number) {
            this.number = number;
        }

        public int getNext() {
            if (number == 0) {
                return 99;
            }
            return number - 1;
        }

        public String getAction() {
            if (number == 0)
                return "Go to the store, buy some more,";
            return "Take one down, pass it around,";
        }

        public String getContainer() {
            if (number == 1)
                return " bottle";
            return " bottles";
        }
    }
}
