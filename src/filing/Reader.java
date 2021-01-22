package filing;

import java.io.IOException;

public interface Reader {

    void readFromFile(String filename) throws IOException;
}
