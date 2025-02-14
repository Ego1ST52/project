import java.io.IOException;
import java.nio.file.Files;

public class FileUtils {
    public static String readFile(String path) {
        File file = new File(path);

        if (!file.exists()) {
            return "";
        }

        try {
            return Files.readString(file.toPath(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Something went wrong on reading");

            return "";
        }
    }

    public static void saveFile(String path, String content) {
        File file = new File(path);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            Files.writeString(file.toPath(), content, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Some troubles: " + e.getMessage());
        }
    }
}

