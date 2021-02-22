public class Square extends Region {

    public Square(){}

    public String toString() {
        StringBuilder acc = new StringBuilder("");

        for (int i=1; i<10; ++i)
        {
            acc.append("| ");
            acc.append(children.get(i).toString());
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

    @Override
    public void AddChild(Tile tile, int index) {
        this.children.put(index, tile);
        tile.SetSquare(this);
    }
}
