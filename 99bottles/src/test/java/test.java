import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test {
    @Test
    public void test() throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        new Bottles().generateOutput(printStream);
        String actual = new String(stream.toByteArray());

        String expected = new String(Files.readAllBytes(Paths.get("src/main/resources/bottles.txt")));

        Assert.assertEquals(actual, expected);

    }
}
