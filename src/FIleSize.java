import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FIleSize {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Dimitar\\Desktop\\Screenshot 2022-09-27 121902.png");
        try {
            long size = Files.size(path);
            System.out.println(size + " bytes");
        } catch (Exception e) {
            System.out.println("file doesn't exist");
        }
    }// asb asdas as ads ff
    //String [] arr = { "asv", "asv"}
 }
