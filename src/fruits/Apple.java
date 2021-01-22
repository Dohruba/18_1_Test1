package fruits;

public class Apple extends FruitImpl {

    private static int number = 0;
    private static FruitType type = FruitType.Apfel;

    public static int getNumber() {
        return number;
    }
    public Apple(){
        this.setThisNumber(number++);
        this.setWeight((float) Math.random());
        this.setType(type);

    }

}
