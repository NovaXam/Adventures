/**
 * Created by student on 3/11/18.
 */
public class Cell_regular extends Cell {
    private String [] content;
    public String type = "regular";

    public Cell_regular(int number, String [] content) {
        this.content = content;
    };

    public String [] getContent() {
        return content;
    };

    public int getNumber() {
        return this.number;
    };

    public void setContent(String [] newContent) {
        this.content = newContent;
    };
};
