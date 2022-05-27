package academy.devdojo.maratonajava.javacore.Vio.test;
//File
//FileWeiter
//FileReader
//BufferedWriter
//BufferedReader
//


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01Test {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Escrevendo dentro do arquivo\nNa próxima linha ");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
