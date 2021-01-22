package application;

import fruits.Apple;
import fruits.Bierne;
import fruits.Fruit;
import lager.Lager;
import lager.LagerImpl;

public class Application {
    public static void main (String[] args) throws Exception {

        Lager lagerApp = new LagerImpl();
        for (int i = 0; i<100; i++){
            if (i%2==1){
                lagerApp.putGood(new Apple());
            }else lagerApp.putGood(new Bierne());
        }

        for (int i = 0; i<LagerImpl.FruitList.size(); i++){
            System.out.println(LagerImpl.FruitList.get(i).toString() + ". Weight: " + LagerImpl.FruitList.get(i).getWeight());
        }

        System.out.println("\n\n\n\n\n\n\n");
        Fruit[] OrganizedFruit = lagerApp.getSortedArray();
        for (int i = 0; i< OrganizedFruit.length; i++){
            System.out.println(OrganizedFruit[i].toString() + ". Weight: " + OrganizedFruit[i].getWeight());

        }

    }
}
