package fruits;

public interface Fruit {

    /**
     * Gets the number of the specific fruit, according to it´s type
     * @return
     * @throws Exception
     */
     int getThisNumber() throws Exception;

    /**
     *
     * @return The type of fruit
     * @throws Exception
     */
     FruitType getType() throws Exception;

    /**
     *
     * @return How much the fruit weights
     * @throws Exception
     */
     double getWeight() throws Exception;

    /**
     *
     * @return "FruitType #" and the number of the fruit
     */
    @Override
    public String toString();
}
