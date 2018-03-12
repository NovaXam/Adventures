import java.util.Arrays;
import java.util.HashMap;

public class Controller {
    private static Controller CONTROLLER = null;
    public static int [] QUESTION_STORAGE = new int[11];

    public Controller() {}

    public static Controller getController() {
        if(CONTROLLER == null) {
            CONTROLLER = new Controller();
        };
        return CONTROLLER;
    };

//    public String[] generatorRandomQuest(int num, HashMap<Integer, String[]> map) {
//        String [] questBlock;
//        int result = (int)Math.round(Math.random() * num);
//        if (QUESTION_STORAGE [result] != 0) {
//            while (QUESTION_STORAGE [result] != 0) {
//                result = (int)Math.round(Math.random() * num);
//            };
//        };
//        questBlock = map.get(result);
//        QUESTION_STORAGE [result] = result;
//        return questBlock;
//    };

    public String generatorRandomHints(int num, HashMap<Integer, String> map) {
        int result = (int)Math.round(Math.random() * num);
        return map.get(result);
    };

    public int rollDice() {
        Dice dice = Dice.getDice();
        int move = (int)Math.ceil(Math.random() * dice.side.length);
        dice.moves.add(move);
        return move;
    };
};
