package filing;

import fruits.Apple;
import fruits.Fruit;
import org.junit.Test;

import java.io.IOException;

public class filingTest {




    @Test
    public void writeReadTest() throws InterruptedException, IOException {
        Fruit testApple = new Apple();
        Fruit testApple2 = new Apple();
        Fruit[] testArray = new Fruit[]{testApple,testApple2};
        Fruit[] destinationArray;


        Writer testWriter = new FilingImpl();
        Reader testReader = new FilingImpl();

        testWriter.writeOnFile(testArray,"Test.txt" );
        Thread.sleep(2000);
        testReader.readFromFile("Test.txt");

    }
}
