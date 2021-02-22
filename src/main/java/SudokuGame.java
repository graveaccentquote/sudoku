public class SudokuGame {

    private Square[] squares = new Square[9];

    private Row[] rows = new Row[9];

    private Column[] columns = new Column[9];

    public SudokuGame()
    {
        Tile tile;

        for (int i=0; i<9; ++i)
        {
            squares[i] = new Square();
            rows[i] = new Row();
            columns[i] = new Column();
        }

        for (int row=0; row < 9; ++row)
            for (int column=0; column < 9; ++column)
            {
                tile = new Tile();
                this.rows[row].AddChild(tile, column);
                this.columns[column].AddChild(tile, row);
                this.squares[Square.getSquareIndex(row, column)].AddChild(tile, row, column);
            }
    }

    public void FillTile(int rowIndex, int columnIndex, Value value)
    {
        this.rows[rowIndex].getChild(columnIndex).Fill(value);
    }

    public Column[] getColumns() { return this.columns; }

    public Row[] getRows() { return  this.rows; }

    public Square[] getSquares() { return this.squares; }

}
