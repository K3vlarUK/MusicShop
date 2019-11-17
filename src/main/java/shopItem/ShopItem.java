package shopItem;

public abstract class ShopItem implements ISell {

    protected double boughtPrice;
    protected double sellPrice;

    public ShopItem(double boughtPrice, double sellPrice) {
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.boughtPrice;
    }
}
