package fruits;

public abstract class FruitImpl implements Fruit {
    private FruitType type;
    public int thisNumber;
    private double weight;

    public void setType(FruitType type) {
        this.type = type;
    }


    public void setThisNumber(int thisNumber) {
        this.thisNumber = thisNumber;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public FruitType getType() {
        return type;
    }

    @Override
    public int getThisNumber() throws Exception {
        return this.thisNumber;
    }

    @Override
    public String toString(){
        return type.toString() + " #" + thisNumber;
    }
}
