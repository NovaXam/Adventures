import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;
import java.io.*;
import java.util.HashMap;

public class Storage {
    private static Storage MAINDATASTORE = null;
    private static String [] LINKSTORE = {"Data/questions.rtf", "Data/instructions.rtf", "Data/Hints.rtf", "Data/Score.rtf", "Data/WhiteMagic.rtf", "Data/BlackMagic.rtf"};
    protected Storage() {
    };

    public static Storage getStoreInstance() {
        if(MAINDATASTORE == null) {
            MAINDATASTORE = new Storage();
            return MAINDATASTORE;
        } else {
            return MAINDATASTORE;
        }
    };

    public HashMap<Integer, String []> queryQuestions(int level, String topic) {
        HashMap<Integer, String []> list = new HashMap<>();
        String [] arr, temp;
        int elem = 1;
        arr = requestData(LINKSTORE[0]).split(";");
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i].split(",");
            int var = Integer.parseInt(temp[2].trim());
            if (var == level && (temp[3].trim()).equals(topic)) {
                String [] questAndAnswer =  {temp[1], temp[0]};
                list.put(elem, questAndAnswer);
                elem++;
                }
            };
        return list;
    };

    public String getInstruction() {
        return requestData(LINKSTORE[1]);
    };

    public HashMap<Integer, String> getHints() {
        HashMap<Integer, String> list = new HashMap<>();
        String [] arr;
        int elem = 1;
        arr = requestData(LINKSTORE[2]).split("\n");
        for (int i = 0; i < arr.length - 1; i++) {
            list.put(elem, arr[i]);
            elem++;
        };
        return list;
    };

    public String requestData(String address) {
        String template = "";
        try {
            FileInputStream stream = new FileInputStream(address);
            RTFEditorKit kit = new RTFEditorKit();
            Document doc = kit.createDefaultDocument();
            kit.read(stream, doc, 0);
            template = doc.getText(0, doc.getLength());
        } catch (BadLocationException bl) {
            bl.getMessage();
        } catch (FileNotFoundException nf) {
            nf.getMessage();
        } catch (IOException io) {
            io.getMessage();
        }
        return template;
    };

    public String getScoreHistory() {
        return requestData(LINKSTORE[3]);
    };

    public String [] getWhiteMagic() {
        String [] whiteMagicArr;
        whiteMagicArr = requestData(LINKSTORE[4]).split("\n");
        return whiteMagicArr;
    };

    public String [] getBlackMagic() {
        String [] blackMagic;
        blackMagic = requestData(LINKSTORE[5]).split("\n");
        return blackMagic;
    };
}