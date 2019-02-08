import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFile {
    public static Path getFile() {
        Path pathToFile = Paths.get("Todo.txt");
        return pathToFile;
    }
}
