package shopItem.instruments;

import shopItem.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay {

    private String colour;
    private String material;
    private String type;

    public Instrument(double boughtPrice, double sellPrice, String colour, String material) {
        super(boughtPrice, sellPrice);
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setType(String type) {
        this.type = type;
    }
}
