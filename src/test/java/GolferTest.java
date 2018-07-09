import models.Golfer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GolferTest {
    Golfer golfer;

    @Before
    public void setUp(){
        golfer = new Golfer("Happy","Madison",22, 3);
    }

    @Test
    public void hasName(){
        assertEquals("Happy",golfer.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("Madison",golfer.getLastName());
    }

    @Test
    public void hasAge(){
        assertEquals(22,golfer.getAge());
    }

    @Test
    public void hasHandicap(){
        assertEquals(3,golfer.getHandicap());
    }
}
