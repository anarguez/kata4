package kata4;

import java.io.File;

public class Kata4 {

    public static void main(String[] args) {
        File file = new File("c:\\");
        String[] names = file.list();
        for (String s: names) {
            System.out.println(s);
        }
    }
}
