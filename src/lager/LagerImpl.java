package lager;

import fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class LagerImpl implements Lager {

    public static List<Fruit> FruitList = new ArrayList<>();

    @Override
    public int putGood(Fruit fruit) throws Exception {
        FruitList.add(fruit);
        return FruitList.size() - 1;
    }

    @Override
    public Fruit getGood(int index) throws Exception {
        return FruitList.get(index);
    }

    @Override
    public Fruit[] getSortedArray() throws Exception {
        int size = FruitList.size();
        Fruit[] toReturn = new Fruit[size];

        for (int i = 0; i < FruitList.size(); i++ ){
            for (int j = i+1; j < FruitList.size();j++ ){
                double first = FruitList.get(i).getWeight();
                double second = FruitList.get(j).getWeight();
                Fruit temp;
                if (first < second){
                    temp = FruitList.get(i);
                    FruitList.set(i, FruitList.get(j));
                    FruitList.set(j, temp);

                }
            }
        }


        for (int a = 0; a < toReturn.length; a++){
            toReturn[a] = FruitList.get(a);
        }

        return toReturn;
    }
}
