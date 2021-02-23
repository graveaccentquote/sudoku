public class SudokuSolver {

    public static void main(String[] argv)
    {
        SudokuGame game = new SudokuGame();
        SudokuGame game2 = new SudokuGame("./boards/board1.json");

        game.fillTile(0, 0, Value.FIVE);
        game.fillTile(1, 2, Value.EIGHT);
        game.fillTile(3, 3, Value.THREE);
        game.fillTile(4, 4, Value.FOUR);
        game.fillTile(5, 6, Value.SEVEN);

        System.out.println(game.toString());

        System.out.println(game2.toString());
    }
}
