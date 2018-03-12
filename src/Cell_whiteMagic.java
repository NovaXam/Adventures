/**
 * Created by student on 3/11/18.
 */
public class Cell_whiteMagic extends Cell {
    String type = "white_magic";
    String content;

    public Cell_whiteMagic(int number, String content) {
        this.content = content;
    };

    public String getContent() {
        return this.content;
    };

    public int getNumber() {
        return this.number;
    };

    public void setContent(String newContent) {
        this.content = newContent;
    };
}
