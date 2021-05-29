package ua.Bykov.Hw9;

public class ChessTask {
        private Converter converter;

        public ChessTask() {
        }

        public ChessTask(Converter converter) {
            this.converter = converter;
        }

        public boolean move(String currentPosition, String nextPosition) {
            System.out.println("currentPosition = " + currentPosition);
            System.out.println("nextPosition = " + nextPosition);
            int currentPositionIndex = converter.convert(currentPosition);
            System.out.println("currentPositionIndex = " + currentPositionIndex);
            int nextPositionIndex = converter.convert(nextPosition);
            System.out.println("nextPositionIndex = " + nextPositionIndex);
            return true;
        }

        public int convert(String position) {
            return converter.convert(position);
        }
    }

