package final_project;

public class Ship {

    private int x;
    private int y;

    public String getName() {
        return name;
    }

    private String name;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    private char symbol;

    public Ship(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }
}
