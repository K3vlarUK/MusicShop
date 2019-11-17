package shopItem.instruments;

public class Piano extends Instrument {
    private final String type;

    public Piano(double boughtPrice, double sellPrice, String colour, String material, String type) {
        super(boughtPrice, sellPrice, colour, material);
        this.type = InstrumentType.KEYBOARD.toString();
    }

    public String getType() {
        return type;
    }

    public String play() {
        return "The Piano chimes";
    }
}
