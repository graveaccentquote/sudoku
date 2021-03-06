public class Row extends Region {

    public Row()
    {
        for (int i=0; i<9; ++i)
            this.children[i] = new Tile();
    }

    public Row(Value[] values)
    {
        for (int i=0; i<9; ++i)
            this.children[i] = new Tile(values[i]);
    }

    public String toString() {
        StringBuilder acc = new StringBuilder("");

        for (int i=0; i<9; ++i)
        {
            acc.append("| ");
            acc.append(children[i].toString());
            acc.append(" ");
        }

        return acc.toString();
    }

    @Override
    public void AddChild(Tile tile, int index) {
        this.children[index] = tile;
        tile.SetRow(this);
    }
}
