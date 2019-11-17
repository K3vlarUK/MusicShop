package shopItem.instruments;

public class Guitar extends Instrument {
    private String type;

    public Guitar(double boughtPrice, double sellPrice, String colour, String material, String type) {
        super(boughtPrice, sellPrice, colour, material);
        this.type = InstrumentType.STRING.toString();
    }

    public double calculateMarkup() {
        return this.sellPrice - this.boughtPrice;
    }

    public String getType() {
        return type;
    }

    public String play() {
        return "The Guitar Strums";
    }
}
