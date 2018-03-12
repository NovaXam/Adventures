/**
 * Created by student on 3/11/18.
 */
public class Cell_blackMagic extends Cell {
    public String type = "black_magic";
    private String content;

    public Cell_blackMagic(int number, String content) {
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
