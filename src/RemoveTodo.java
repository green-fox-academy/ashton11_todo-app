import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class RemoveTodo {
    public static void removeTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell me the number of the task you wish to delete:");
        int numberOfTodo = scanner.nextInt();
        try {
            List<String> toDos =Files.readAllLines(GetFile.getFile());
            toDos.remove(numberOfTodo-1);
            Files.write(GetFile.getFile(), toDos);
        }catch (IOException ex){
            System.out.println("File doesn't exist!");
        }
    }
}
