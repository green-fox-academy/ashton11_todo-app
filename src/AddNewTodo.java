import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNewTodo {
    public static void addTodoToFile(){
        System.out.println("Please type in new task:");
        Scanner scanner = new Scanner(System.in);
        String newTodo = scanner.nextLine();
        if (newTodo.isEmpty()){
            System.out.println("Start typing in new tasks you dummy!");
        }
        List<String> newTodos = new ArrayList<>();
        newTodos.add(0, newTodo);
        try {
            Files.write(GetFile.getFile(), newTodos, StandardOpenOption.APPEND);
        }catch (IOException ex){
            System.out.println("File doesn't exist!");
        }
    }
}
