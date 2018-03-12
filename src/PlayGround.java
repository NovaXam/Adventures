import java.util.HashMap;

public class PlayGround {
    private static PlayGround PLAYGROUND = null;
    private static int CELLCOUNT;
    public String level, topic;
    public static HashMap<Integer, Cell> listOfCell =  new HashMap<>();
    private Storage storage = Storage.getStoreInstance();

    public PlayGround(int num, String level, String topic) {
        CELLCOUNT = num;
        this.level = level;
        this.topic = topic;
    };

    public static PlayGround getPlayGround(int num, String level, String topic) {
        if (PLAYGROUND == null) {
            PLAYGROUND = new PlayGround(num, level, topic);
        };
        return PLAYGROUND;
    };

    public int getCellCount() {
        return PlayGround.CELLCOUNT;
    };

    public void setCellCount(int num) {
        PlayGround.CELLCOUNT = num;
    };

    public HashMap<Integer, Cell> createCell() {
        int ranNum;
        System.out.println(this.level + " " + this.topic);
        HashMap<Integer, String []> mapQuestion = storage.queryQuestions(Integer.parseInt(this.level), this.topic);
        String [] mapBlackMagic = storage.getBlackMagic();
        String [] mapWhiteMagic = storage.getWhiteMagic();
        System.out.println(mapQuestion.size() + " " + mapBlackMagic.length + " " + mapWhiteMagic.length);

        ranNum = (int) Math.ceil(Math.random() * 19);
        while(listOfCell.size() < 19) {
            if (!listOfCell.containsKey(ranNum)) {
                if(listOfCell.size() < 3) {
                    listOfCell.put(ranNum, new Cell_whiteMagic(ranNum, mapWhiteMagic[listOfCell.size()]));
                    System.out.println(listOfCell.size());
                } else if (3 <= listOfCell.size() && listOfCell.size() < 8) {
                    listOfCell.put(ranNum, new Cell_blackMagic(ranNum, mapBlackMagic[listOfCell.size() - 3]));
                    System.out.println(listOfCell.size());
                } else if (8 <= listOfCell.size() && listOfCell.size() < 19) {
                    listOfCell.put(ranNum, new Cell_regular(ranNum, mapQuestion.get(listOfCell.size() - 8)));
                    System.out.println(listOfCell.size());
                };
            } else {
                ranNum = (int) Math.ceil(Math.random() * 19);
            };
        };
        return listOfCell;
    };
}