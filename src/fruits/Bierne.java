package fruits;

public class Bierne extends FruitImpl {
    private static int number = 0;
    private static FruitType type = FruitType.Bierne;

    public static int getNumber() {
        return number;
    }
    public Bierne(){
        this.setThisNumber(number++);
        this.setWeight((float) Math.random());
        this.setType(type);
    }
}
