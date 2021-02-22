public class Row extends Region {

    public Row(){}

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
