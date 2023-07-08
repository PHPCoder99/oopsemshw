package sem3.hw;

import java.io.FileWriter;
import java.io.IOException;

// testing. do not touch.
public class FileHandler {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n");
            myWriter.write("a");
            myWriter.close(); // necessary or computer go boom, apparently.
        } catch (IOException e){
            doNothing();
        }
    }

    public static void doNothing(){
        // doing nothing...
    }
}
