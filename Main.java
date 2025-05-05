package task_manager;

public class Main {
    public static void main(String[] args) {
        Helper.clear_screen();
        Main game_loop = new Main();

        game_loop.start();
    }

    void start(){
        while (true) {
            Helper.clear_screen();
            System.out.println("Enter a selection:");
            System.out.println("1) View deadline tasks");
            System.out.println("2) View long-term tasks");
            System.out.println("3) View completed tasks");
            System.out.println("4) Delete a task");
            System.out.println("5) Add a task");
            System.out.println("6) Mark task as complete");
            System.out.println("7) Quit the program");



        }
    }

    void handle_input(String input) {
        if (input == "1") {
            //view deadlinetasks
        }
    }

}
