package shop;

import shopItem.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        int index = this.stock.indexOf(item);
        this.stock.remove(index);
    }

    public int getStockLength(){
        return this.stock.size();
    }

    public double potentialProfit(){
        double profit = 0;
        for (ISell item : stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
