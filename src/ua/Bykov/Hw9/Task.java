package ua.Bykov.Hw9;

public class Task {
        public static void main(String[] args) {

            Converter converter = new Converter();
            ChessTask chessTask = new ChessTask(converter);

        chessTask.move("A3", "B6");

            int index1 = chessTask.convert("A3");
            System.out.println("index A3 = " + index1);
            int index2 = chessTask.convert("B6");
            System.out.println("index B6 = " + index2);
        }
    }

