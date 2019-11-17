package shopItem.instruments;

public class Flute extends Instrument {

    private String type;

    public Flute(double boughtPrice, double sellPrice, String colour, String material, String type) {
        super(boughtPrice, sellPrice, colour, material);
        this.type = InstrumentType.WOOD.toString();
    }

    public String play() {
        return "The Flute toots";
    }

    public String getType() {
        return type;
    }
}
