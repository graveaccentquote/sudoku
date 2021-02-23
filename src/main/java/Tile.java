import java.util.ArrayList;
import java.util.HashSet;

public class Tile {

    ///Attributes
    private Value value;
    private Row row;
    private Column column;
    private Square square;

    ///Constructors
    public Tile(){ this.value = (Value.EMPTY); }

    public Tile(Value value) { this.Fill(value); }

    ///Methods

    public void Fill(Value value)  {
        assert (value.getValue() > 0 && value.getValue() < 10) : "Trying to invalid value";
        this.value = value;
    }

    public ArrayList<Value> GetPossibleFillings()
    {
        //Get the set of rows
        HashSet<Value> result = new HashSet<Value>(this.row.getPossibleFillings());
        //Intersect the set with the column Set
        result.retainAll( new HashSet<Value>(this.column.getPossibleFillings()));
        //Intersect it again with the square Set
        result.retainAll( new HashSet<Value>(this.square.getPossibleFillings()));
        //Remove the empty values
        result.remove(Value.EMPTY);

        return new ArrayList<Value>(result);
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

    public Value GetValue() { return this.value; }
}
