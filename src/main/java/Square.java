import java.util.Arrays;

public class Square extends Region {

    public Square(){}

    public String toString() {
        StringBuilder acc = new StringBuilder("");

        for (int i=0; i<9; ++i)
        {
            acc.append("| ");
            acc.append(children[i].toString());
            acc.append(" ");

            if ((i+1) % 3 == 0)
            {
                acc.append("|");
                acc.append("\n");
                acc.append("------------------------");
                acc.append("\n");
            }
        }

        return acc.toString();
    }

    public Tile getChildFrom2Indexes(int row, int column)
    {
        return this.children[row % 3 + (column % 3) * 3];
    }

    @Override
    public void AddChild(Tile tile, int index) {
        this.children[index] = tile;
        tile.SetSquare(this);
    }

    public void AddChild(Tile tile, int rowIndex, int columnIndex) {
        this.children[(rowIndex % 3) * 3 + columnIndex % 3] = tile;
        tile.SetSquare(this);
    }

    public static int getSquareIndex(int row, int column)
    {
        return column / 3 + (row / 3) * 3;
    }
}
