package shopItem.accessories;

import shopItem.ShopItem;

public abstract class Accessory extends ShopItem {

    private String type;

    public Accessory(double boughtPrice, double sellPrice, String type) {
        super(boughtPrice, sellPrice);
        this.type = type;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.boughtPrice;
    }
}
