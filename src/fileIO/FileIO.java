package fileIO;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static void main(String[] args) {
        init();
    }

    public static void init(){

        // Try to create the directory
        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        FileDirectoryUtil.tryCreateDirectory(path);

        // Try to create the file
        path = Paths.get(path.toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        IOUtil.tryWriteToFile(null, path);

        // Print out the final location of the file
        System.out.println(path.toAbsolutePath());
        IOUtil.tryPrintContents(path);

    }

    public static List<String> getContent(){
        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("This is a new line");
        contentToWrite.add("This is a new new line");
        contentToWrite.add("This is a new new new line");

        return contentToWrite;
    }




}





