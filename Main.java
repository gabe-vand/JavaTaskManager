
import java.util.Scanner;

public class Main {

    boolean terminate = false;
    TaskBook tasks = new TaskBook();

    public static void main(String[] args) {
        Helper.clear_screen();
        Main game_loop = new Main();

        game_loop.tasks.addTask(new SimpleTask("Finish Project", "finish this tasks project"));

        game_loop.start();
    }

    void start(){
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!terminate) {
            System.out.println("Enter a selection:");
            System.out.println("1) View deadline tasks");
            System.out.println("2) View simple tasks");
            //System.out.println("3) View completed tasks");
            //System.out.println("4) Delete a task");
            System.out.println("5) Add a task");
            //System.out.println("6) Mark task as complete");
            System.out.println("7) Quit the program");

            input = scanner.nextLine();

            Helper.clear_screen();

            handle_input(input);

        }

        scanner.close();
    }

    void handle_input(String input) {
        switch (input.trim()){
            case "1":
                tasks.display_task_type("DeadLineTask");
                break;

            case "2":
                tasks.display_task_type("SimpleTask");
                break;

            case "3":
                break;

            case "4":
                break;

            case "5":
                tasks.createNewTask();
                break;

            case "6":
                break;

            case "7":
                terminate = true;
                break;


        }
    }

}
