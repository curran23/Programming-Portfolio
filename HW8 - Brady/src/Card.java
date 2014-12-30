

public class Card {

	private final String[] Color = {"RED", "BLUE", "GREEN", "YELLOW", "NONE" };

	private final String[] Number = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
            "NINE", "REVERSE", "SKIP", "DRAW_TWO", "WILD", "FOUR_WILD" };


    private final String color;
    private final String number;

    public Card(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }
    
    public String getNumber() {
        return number;
    }

    public String toString() {
        return color + " " + number;
    }

}