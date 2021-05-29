package ua.Bykov.Hw9;
    import org.junit.Assert;
import org.junit.Test;

    public class ChessTaskTest {

        Converter converter = new Converter();
        ChessTask chessTask = new ChessTask(converter);

        @Test
        public void simpleTest() {
            int expectedOutput = 3;
            String input = "A3";
            int actualOutput = chessTask.convert(input);
            Assert.assertEquals(expectedOutput, actualOutput);
        }

        @Test
        public void simpleTest2() {
            int expectedOutput = 14;
            String input = "B6";
            int actualOutput = chessTask.convert(input);
            Assert.assertEquals(expectedOutput, actualOutput);
        }

    }

