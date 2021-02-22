public class SudokuGame {

    Square[] squares = new Square[9];

    Row[] rows = new Row[9];

    Column[] columns = new Column[9];

    public SudokuGame()
    {
        Tile tile;
        int square;

        for (int row=1; row < 10; ++row)
            for (int column=1; column < 10; ++column)
            {
                tile = new Tile();

                this.rows[row].AddChild(tile, column);
                this.columns[column].AddChild(tile, row);
                square = this.getSquareIndex(row, column);
                this.squares[square].AddChild(tile, square);
            }
    }

    public void FillTile(int rowIndex, int columnIndex)
    {
        //TODO
    }

    private int getSquareIndex(int row, int column)
    {
        return (int) (1 + Math.ceil(column / 3.0) + Math.ceil(row / 3.0));
    }
}
