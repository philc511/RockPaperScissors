import static org.junit.Assert.*;

import org.junit.Test;
import org.pjc.rps.AIPlayer;

public class AIPlayerTest {

    @Test
    public void test() {
        AIPlayer p = new AIPlayer();
        p.move();
        fail();
    }

}
