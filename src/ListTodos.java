import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ListTodos {

    public static void listTodos(){

        try {
            List<String> toDos = Files.readAllLines(GetFile.getFile());
            for (int i = 0; i < toDos.size() ; i++) {
                String toDo = toDos.get(i);
                int serialNumber = i + 1;
                System.out.println(serialNumber + " " + toDo);
            }
        } catch(IOException ex){
            System.out.println("File doesn't exist!");
        }
    }
}
