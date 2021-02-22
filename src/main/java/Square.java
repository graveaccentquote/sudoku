public class Square extends Region {

    public Square(){}

    public String toString() {
        StringBuilder acc = new StringBuilder("");

        for (int i=1; i<10; ++i)
        {
            acc.append("| ");
            acc.append(children[i].toString());
            acc.append(" ");

            if (i % 3 == 0)
            {
                acc.append("|");
                acc.append("\n");
                acc.append("----------------------");
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
}
