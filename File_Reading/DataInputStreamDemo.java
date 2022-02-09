package Week4.Session16.File_Reading;

import java.io.*;

public class DataInputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {

        File f = new File("src/Week4/Session16/File_Reading/Abc.txt");
        FileInputStream f1 = new FileInputStream(f);

        DataInputStream din=new DataInputStream(f1);

        if(f.exists()){
            int i=0;
            while ((i=din.read())!=-1){
                System.out.print((char)i);
            }
        }
        else
            System.out.println("Oops,File not found");
    }
}

/*
Hello World .
This is the Java Training .
File Handling .
* */
