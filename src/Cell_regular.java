
public class Cell_regular extends Cell {
    private String [] content;
    public String type;

    public Cell_regular(int number, String [] content, String type) {
        super(number, type);
        this.content = content;
    };

    public String[] getContent() {
        return this.content;
    };
};
