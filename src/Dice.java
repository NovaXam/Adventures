import java.util.ArrayList;

/**
 * Created by student on 3/11/18.
 */
public class Dice {
    private static Dice dice = null;
    public int [] side = {1, 2, 3, 4, 5, 6};
    public ArrayList<Integer> moves = new ArrayList<>();

    public Dice(){};

    public static Dice getDice() {
        if (dice == null) {
            dice = new Dice();
        };
        return dice;
    };

    public void setMoves(int i) {
        moves.add(i);
    }
};