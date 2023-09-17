package magentoWeb.utilities;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

public class DownloadsFileHandler {
    private static void deleteFileFrom(String path){
        File file = new File(path);
        file.delete();
    }

    private static File getDownloadsDirectory(){
        String home = System.getProperty("user.home");
        return new File(home + "/Downloads/");
    }

    public static List<String> getFiles(String fileName) {
        File directory =  getDownloadsDirectory();
        FilenameFilter filter = (dir, name) -> name.startsWith(fileName);
        return Arrays.asList(directory.list(filter));
    }

    public static void deleteFile(String fileName) {
        List<String> files = getFiles(fileName);
        File directory = getDownloadsDirectory();
        deleteFileFrom( directory + "/" + files.get(0));
    }
}
