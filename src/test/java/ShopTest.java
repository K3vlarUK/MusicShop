import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shopItem.ISell;
import shopItem.ShopItem;
import shopItem.accessories.SheetMusic;
import shopItem.instruments.Guitar;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop musicShop;
    Guitar guitar;
    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        musicShop = new Shop();
        guitar = new Guitar(100, 150, "Black", "Wooden", "Electric");
        sheetMusic = new SheetMusic(15, 20, "Classical");
    }

    @Test
    public void shopStartsWithNoStock() {
        assertEquals(0, musicShop.getStockLength());
    }

    @Test
    public void shopCanAddItemsToStock() {
        musicShop.addStock(guitar);
        musicShop.addStock(sheetMusic);
        assertEquals(2, musicShop.getStockLength());
    }

    @Test
    public void shopCanRemoveStock() {
        musicShop.addStock(guitar);
        musicShop.addStock(sheetMusic);
        musicShop.removeStock(guitar);
        assertEquals(1, musicShop.getStockLength());
    }

    @Test
    public void canGetTotalProfit() {
        musicShop.addStock(guitar);
        musicShop.addStock(sheetMusic);
        assertEquals(55.0, musicShop.potentialProfit(), 0.01);
    }
}
