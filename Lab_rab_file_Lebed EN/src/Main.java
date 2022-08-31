import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C://papka/3.txt", true);
        String text = "Новое задание. ";
        writer.write(text);
        writer.close();
        FileReader reader = new FileReader("c://papka/3.txt");
        int c;
        while ((c=reader.read()) !=-1) {
            System.out.print((char)c);
        }
        reader.close();
    }
}