package lager;

import fruits.Fruit;

public interface Lager {

    /**
     * Saves a new fruit on the list
     * @param fruit Apfel o. Bierne
     * @return The index of the new Fruit
     */
    int putGood(Fruit fruit) throws Exception;

    /**
     *
     * @param index
     * @return the Fruit on the specified index.
     */
    Fruit getGood(int index) throws Exception;

    /**
     * Sorts the whole list of fruits by weight
     * from heavier to lighter and
     * @return the organized Fruit in a Fruit Array
     */
    Fruit[] getSortedArray()throws Exception;

}
