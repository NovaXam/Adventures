import java.util.ArrayList;
import java.util.Scanner;

public class InitializingOfGame {
    private String numPlayers, gameLevel, gameTopic;
    private String [] tempStor = new String[3];
    public String downloadBar = "";
    public ArrayList<String> topicList = new ArrayList<>();

    public void setGameParams() {
        startWindow();
        setNumPlayers();
        setGameLevel();
        setGameTopic();
        confirmSet();
    };

    public String getNumPlayers() {
        return numPlayers;
    };

    public String getGameLevel() {
        return gameLevel;
    };

    public String getGameTopic() {
        return gameTopic;
    }

    public void startWindow() {
        System.out.println("===============WELCOM TO ADVENTURES=============");
    };

    public void setNumPlayers() {
        System.out.println("Please, chose the number of players(up to 3): ");
        Scanner scanner = new Scanner(System.in);
        tempStor[0] = scanner.nextLine();
        while (tempStor[0] == null || Integer.parseInt(tempStor[0]) < 1 && Integer.parseInt(tempStor[0]) > 3) {
            System.out.println("Please, chose the number of players(up to 3): ");
            tempStor[0] = scanner.nextLine();
        };
    }

    public void setGameLevel() {
        System.out.println("Please, chose the level of the game(\"press 0 for \"simple\", 1 for \"medium\",  2 for \"hard\"): ");
        Scanner scanner = new Scanner(System.in);
        tempStor[1] = scanner.nextLine();
        while (tempStor[1] == null || Integer.parseInt(tempStor[1]) < 1 && Integer.parseInt(tempStor[1]) > 3) {
            System.out.println("Please, chose the level of the game(\"press 0 for \"simple\", 1 for \"medium\",  2 for \"hard\"): ");
            tempStor[1] = scanner.nextLine();
        };
    };

    public void setGameTopic() {
        this.topicList.add("Movie");
        this.topicList.add("Character");
        this.topicList.add("Rules");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, chose the topic of the game(\"Movie\", \"Character\", \"Rules\"): ");
        tempStor[2] = scanner.nextLine();
        while (tempStor[2] == null || !this.topicList.contains(tempStor[2])) {
            System.out.println("Please, chose the topic of the game(\"Movie\", \"Character\", \"Rules\"): ");
            tempStor[2] = scanner.nextLine();
        };
    };

    public static void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    };

    //verify info of the game and change it in case of need.
    public void confirmSet() {
        System.out.println("there are all parameters of your game");
        System.out.println("Players: " + this.tempStor[0]);
        System.out.println("Level: " + this.tempStor[1]);
        System.out.println("Topic: " + this.tempStor[2]);
        System.out.println("======================================");
        System.out.println("ready to play press \'Y\', change parameters presss \'C\'");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
            while (response == null && !(response.equals("Y") || response.equals("C"))) {
                System.out.println("Please press \'Y\' if you are ready to play, or \'C\' if you would like to change some params");
            };
        this.assignOrChange(response);
    };

    public void assignOrChange(String str) {
        switch (str) {
            case "Y" : {
                this.numPlayers = tempStor[0];
                this.gameLevel = tempStor[1];
                this.gameTopic = tempStor[2];
            };
                break;
            case "C" : {
                String param = "";
                System.out.println("Previous players: " + this.tempStor[0] + " -> " + " Press 0 to modify players number");
                System.out.println("Previous level: " + this.tempStor[1] + " -> " + " Press 1 to modify players level");
                System.out.println("Previous topic: " + this.tempStor[2] + " -> " + " Press 2 to modify players topic");
                Scanner scanner = new Scanner(System.in);
                param = scanner.nextLine();
                modifyParams(param);
            };
                break;
        };
    };

    public void modifyParams(String choice) {
        switch(choice) {
            case "0" : {
                this.setNumPlayers();
                this.confirmSet();
            }
            break;
            case "1" : {
                this.setGameLevel();
                this.confirmSet();
            }
            break;
            case "2" : {
                this.setGameTopic();
                this.confirmSet();
            };
            default:
                System.out.println("Good luck!, strangers");
        };
    };
}
