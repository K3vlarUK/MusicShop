import org.junit.Before;
import org.junit.Test;
import shopItem.ISell;
import shopItem.ShopItem;
import shopItem.instruments.Piano;

import static junit.framework.TestCase.assertEquals;

public class ShopItemTest {

    ISell piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(1500, 2000, "Black", "Wood", "Grand");
    }

    @Test
    public void itemCanReturnMarkupValue() {
        assertEquals(500.0, piano.calculateMarkup());
    }

}
