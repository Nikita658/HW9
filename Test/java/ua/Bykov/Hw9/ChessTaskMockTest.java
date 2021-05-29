package ua.Bykov.Hw9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

    public class ChessTaskMockTest {

        Converter converter = mock(Converter.class);
        ChessTask chessTask = new ChessTask(converter);

        @Before
        public void before() {
            when(converter.convert("A3")).thenReturn(3);
            when(converter.convert("B6")).thenReturn(14);
        }

        @Test
        public void simpleMockTest() {
            int expectedOutput = 3;
            String input = "A3";
            int actualOutput = chessTask.convert(input);
            Assert.assertEquals(expectedOutput, actualOutput);
        }

        @Test
        public void simpleMockTest2() {
            int expectedOutput = 14;
            String input = "B6";
            int actualOutput = chessTask.convert(input);
            Assert.assertEquals(expectedOutput, actualOutput);
        }

    }
    
