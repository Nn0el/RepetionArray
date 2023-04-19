import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner fil;
        try {
            fil = new Scanner(new File("ideaold.log"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        list.add(fil.nextLine());
System.out.println(list.get(0));

    }
}