import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class test {
    @Test
    public void test(){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        new Bottles().generateOutput(printStream);
        String output = new String(stream.toByteArray());

        Assert.assertNotNull(output);
        Assert.assertTrue(output.length() > 0);
    }
}
