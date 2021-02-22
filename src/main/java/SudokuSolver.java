public class SudokuSolver {

    public static void main(String[] argv)
    {
        SudokuGame game = new SudokuGame();

        Column[] cols = game.getColumns();
        Row[] rows = game.getRows();
        Square[] squares = game.getSquares();

        for (Column col : cols)
            System.out.println(col.toString());

        for (Row row : rows)
            System.out.println(row.toString());

        for (Square square : squares)
            System.out.println(square.toString());
    }
}
