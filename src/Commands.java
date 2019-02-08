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
                System.out.println("Added");
                break;
            case "r":
                System.out.println("Removed");
            break;
            case "c":
                System.out.println("Completed");
            break;
        }
    }
}
