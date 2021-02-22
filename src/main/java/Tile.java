import java.util.ArrayList;
import java.util.HashSet;

public class Tile {

    ///Attributes
    private Value value;
    private Row row;
    private Column column;
    private Square square;

    ///Constructors
    public Tile()
    {
        this.Fill(Value.EMPTY);
    }

    ///Methods

    public void Fill(Value value)  {
        assert (value.getValue() > 0 && value.getValue() < 10);
        this.value = value;
    }

    public ArrayList<Value> GetPossibleFillings()
    {
        //Get the first set
        HashSet<Value> resultSet = new HashSet<Value>(this.row.getPossibleFillings());
        //Intersect the set with the column Set
        resultSet.retainAll( new HashSet<Value>(this.column.getPossibleFillings()));
        //Intersect it with the square Set as well
        resultSet.retainAll( new HashSet<Value>(this.square.getPossibleFillings()));
        resultSet.remove(Value.EMPTY);

        return new ArrayList<Value>(resultSet);
    }

    public String toString()
    {
        return this.value.toString();
    }

    ///Setters & Getters
    public void SetSquare(Square square) {
        this.square = square;
    }

    public void SetRow(Row row)
    {
        this.row = row;
    }

    public void SetColumn(Column column)
    {
        this.column = column;
    }
}
