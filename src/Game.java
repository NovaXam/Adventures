import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private static String LEVEL;
    private static int NUM_PLAYERS;
    private static String TOPIC;
    private static String [] playerList = {"Plyaer1", "Player2", "Player3"};
    private Storage storage = Storage.getStoraInstance();

    public Game(String level, String topic, int numPlayers) {
        LEVEL = level;
        TOPIC = topic;
        NUM_PLAYERS = numPlayers;
    };

    public ArrayList<Player> generatePlayers() {

        ArrayList<Player> list = new ArrayList<>();
        for (int i = 0; i < NUM_PLAYERS; i++) {
            list.add(new Player(playerList[i]));
        };
        return list;
    };

    public HashMap<Integer, String []> generateQuest() {
        return storage.queryQuestions(Integer.parseInt(LEVEL), TOPIC);
    };

    public Menu generateMenu() {
      return new Menu();
    };
};