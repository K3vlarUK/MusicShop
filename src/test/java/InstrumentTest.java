import org.junit.Before;
import org.junit.Test;
import shopItem.instruments.Instrument;
import shopItem.instruments.Piano;

import static junit.framework.TestCase.assertEquals;

public class InstrumentTest {

    Instrument piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(1500, 2000, "Black", "Wood", "Grand");
    }

    @Test
    public void instrumentCanMakeSound() {
        assertEquals("The Piano chimes", piano.play());
    }
}
