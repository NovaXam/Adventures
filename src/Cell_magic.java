
public class Cell_magic extends Cell {
    private String content;
    String number;

    public Cell_magic(int number, String content, String type) {
        super(number, type);
        this.content = content;
    };

    public String getContent() {
        return this.content;
    };
}

