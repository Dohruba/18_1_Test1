package filing;

import fruits.Fruit;

import java.io.IOException;
import java.util.List;

public interface Writer {

    void writeOnFile(Fruit[] fruitArray, String filename) throws IOException;

    void writeOnFile(List<Fruit> fruitList, String filename) throws IOException;

}
