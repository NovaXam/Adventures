import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    Storage store = Storage.getStoraInstance();
    public String instructions = store.getInstruction();
    public HashMap<Integer, String> hints = store.getHints();
    public String history = store.getScoreHistory();



}
