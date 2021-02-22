public class Column extends Region {

    public Column(){}

    public String toString() {
        StringBuilder acc = new StringBuilder("");

        for (int i=1; i<10; ++i)
        {
            acc.append("| ");
            acc.append(children.get(i).toString());
            acc.append(" |");
            acc.append("\n");
        }

        return acc.toString();
    }

    @Override
    public void AddChild(Tile tile, int index) {
        this.children.put(index, tile);
        tile.SetColumn(this);
    }
}
