import java.util.Scanner;

public class Commands {

    public static void commandsInput() {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine()) {
            case "l":
                System.out.println("Tasks for the day:");
                ListTodos.listTodos();
                break;
            case "a":
                AddNewTodo.addTodoToFile();
                System.out.println("Added to tasks!");
                break;
            case "r":
                RemoveTodo.removeTask();
                System.out.println("Removed");
            break;
            case "c":
                System.out.println("Completed");
            break;
        }
    }
}
