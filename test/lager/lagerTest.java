package lager;

import fruits.Apple;
import fruits.Bierne;
import fruits.Fruit;
import fruits.FruitType;
import org.junit.Assert;
import org.junit.Test;

public class lagerTest {


    private static Lager testLager = new LagerImpl();
    private static int fruit1index;
    private static int fruit2index;

    private void putGoods() throws Exception {
        fruit1index = testLager.putGood(new Apple());
        fruit2index = testLager.putGood(new Bierne());
    }

    @Test
    public void goodPutGoodTest() throws Exception {
        putGoods();

        //Fruit before last position is the same as in index1
        Assert.assertEquals(LagerImpl.FruitList.get(fruit1index),LagerImpl.FruitList.get(LagerImpl.FruitList.size()-2));
        Assert.assertEquals(FruitType.Apfel, LagerImpl.FruitList.get(LagerImpl.FruitList.size()-2).getType());

        //Fruit on last position is the same as in index2
        Assert.assertEquals(LagerImpl.FruitList.get(fruit2index),LagerImpl.FruitList.get(LagerImpl.FruitList.size()-1));
        Assert.assertEquals(FruitType.Bierne, LagerImpl.FruitList.get(LagerImpl.FruitList.size()-1).getType());
    }

    @Test
    public void goodGetGoodTest() throws Exception{
        putGoods();
        Fruit fruit1 = testLager.getGood(fruit1index);
        Fruit fruit2 = testLager.getGood(fruit2index);

        //Fruit called by index before last position is the same as in index1
        Assert.assertEquals(fruit1.getType(), FruitType.Apfel);
        //Fruit called by index on last position is the same as in index2
        Assert.assertEquals(fruit2.getType(), FruitType.Bierne);

    }

    @Test
    public void goodSortTest() throws Exception{
        int i = testLager.putGood(new Apple());
        i = testLager.putGood(new Bierne());
        i = testLager.putGood(new Apple());
        Fruit[] weightSortedFruit = testLager.getSortedArray();

        for (int k = 0; k < LagerImpl.FruitList.size()-1; k++){
            //Every Fruit weights less than the next one on the list
            Assert.assertTrue(LagerImpl.FruitList.get(k).getWeight() > LagerImpl.FruitList.get(k+1).getWeight());
        }
    }
}
