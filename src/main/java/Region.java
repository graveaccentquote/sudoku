import java.util.ArrayList;
import java.util.HashMap;

public abstract class Region{

    protected HashMap<Integer, Tile> children = new HashMap<Integer, Tile>();

    public boolean checkPlacement(int i)
    {
        //return !(this.children.containsValue(Value.values()[i]));
        return false; //TODO
    }

    public ArrayList<Value> getPossibleFillings()
    {
        ArrayList<Value> result = new ArrayList<Value>();

        for (int i=1; i<10 ; ++i)
            if (this.checkPlacement(i))
                result.add(Value.values()[i]);

        return result;
    }

    public abstract void AddChild(Tile tile, int index);
}