import sun.tools.java.Parser;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MainApp {

    //Global params of the game
    private static ArrayList<Player> LISTPLAYERS;
    private static HashMap<Integer, String []> LISTQUESTIONS;
    private static Menu MENUINSTANCE;

    public static void main(String [] args) {

        //generating front screen and initial params for the game
        InitializingOfGame initGame = new InitializingOfGame();
        initGame.setGameParams();

        //generating a game instance on base of initial params
        Game game = new Game(initGame.getGameLevel(), initGame.getGameTopic(), Integer.parseInt(initGame.getNumPlayers()));
        LISTPLAYERS = game.generatePlayers();
        LISTQUESTIONS = game.generateQuest();
        MENUINSTANCE = game.generateMenu();

        Controller controller = Controller.getController();

        String [] questionBlock = controller.generatorRandomQuest(LISTQUESTIONS.size(), LISTQUESTIONS);
        String hintBlock = controller.generatorRandomHints(MENUINSTANCE.hints.size(), MENUINSTANCE.hints);
        System.out.println(controller.rollDice());
    };
}
