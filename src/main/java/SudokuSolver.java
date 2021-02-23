import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class SudokuSolver {

    public static void main(String[] argv)
    {
        SudokuGame game = new SudokuGame();
        //SudokuGame game = new SudokuGame("./boards/board1.json");

        System.out.println(game.toString());
    }
}
