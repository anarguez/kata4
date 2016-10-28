package kata4;

import java.io.File;

public class Kata4 {

    public static void main(String[] args) {
        File file = new File("c:\\pub");
        print(file.listFiles(), "");
    }
    
    private static void print(File[] files, String indent){
        if (files==null)return;
        for (File f : files) {
            System.out.println(indent + (f.isDirectory() ? "+" : "-") 
                    + f.getName());
            if(!f.isDirectory() || f.isHidden()) continue;
            print(f.listFiles(), " ");
        }
        
    }
}
