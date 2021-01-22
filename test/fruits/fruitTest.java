package fruits;

import org.junit.Assert;
import org.junit.Test;

public class fruitTest {
    private static final Fruit APPLE1 = new Apple();
    private static final Fruit APPLE2 = new Apple();
    private static final Fruit BIERNE1 = new Bierne();
    private static final Fruit BIERNE2 = new Bierne();

    @Test
    public void goodFruitMixNumberTest() throws Exception {

        Assert.assertEquals(0, APPLE1.getThisNumber());
        Assert.assertEquals(1, APPLE2.getThisNumber());
        Assert.assertEquals(0, BIERNE1.getThisNumber());
        Assert.assertEquals(1, BIERNE2.getThisNumber());
    }

    @Test
    public void goodWholeAmountsTest(){
        Assert.assertEquals(2, Bierne.getNumber());
        Assert.assertEquals(2, Apple.getNumber());
    }
    @Test
    public void goodTypeBranding() throws Exception {
        Assert.assertEquals(APPLE1.getType(), FruitType.Apfel);
        Assert.assertEquals(BIERNE1.getType(), FruitType.Bierne);
    }
    @Test
    public void goodWeighing() throws Exception {
        Assert.assertNotEquals(APPLE1.getWeight(), APPLE2.getWeight());
        Assert.assertNotEquals(BIERNE1.getWeight(),BIERNE2.getWeight());
    }

    @Test
    public void goodStringOutput(){
        String output = APPLE1.toString();
        Assert.assertEquals("Apfel #0", output);
    }

}
