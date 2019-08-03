package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public enum SingletonEnum {


    INSTANCE;

    public  void write(String text, String file)  {


        FileWriter writer = null;
        try {
            writer = new FileWriter(new File(file), true);
            writer.write(text);
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
