import java.util.Scanner;
import java.io.*;
public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr=new FileReader("data.txt");
        Scanner s1= new Scanner(fr);
        MyBean b1=MyBean.getInstance();
        b1.setFirstName(s1.nextLine());
        b1.setLastName(s1.nextLine());	
        System.out.println(b1);
        s1.close();
    }
}