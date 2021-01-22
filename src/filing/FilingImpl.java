package filing;

import fruits.Fruit;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FilingImpl implements Writer, Reader {


    @Override
    public void writeOnFile(Fruit[] fruits, String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        for (int i = 0; i< fruits.length; i++){
            byte[] fruitBytes = (fruits[i].toString() + "\n").getBytes(StandardCharsets.UTF_8);
            fos.write(fruitBytes);
        }
        fos.close();
    }

    @Override
    public void writeOnFile(List<Fruit> fruitList, String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        for (int i = 0; i< fruitList.size(); i++){
            byte[] fruitBytes = (fruitList.get(i).toString() + "\n").getBytes(StandardCharsets.UTF_8);
            fos.write(fruitBytes);
        }
        fos.close();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        Fruit[] toReturn;
        FileInputStream fis = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String readString;

        do {
             readString = br.readLine();
             if (readString != null) System.out.println(readString);
        }while (readString != null);

    }
}
