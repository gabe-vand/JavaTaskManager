
import java.io.IOException;

public class Main {

    boolean terminate = false;

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
            //System.out.println("2) View long-term tasks");
            //System.out.println("3) View completed tasks");
            //System.out.println("4) Delete a task");
            //System.out.println("5) Add a task");
            //System.out.println("6) Mark task as complete");
            System.out.println("7) Quit the program");

            int input;

            try {
                input = System.in.read();
            } catch (IOException e) {
                System.out.println("An error occurred while reading input: " + e.getMessage());
                input = -1;
            } if (input == -1) { return; }

            handle_input(input);

            if (terminate) { return; }

        }
    }

    void handle_input(int input) {
        if (input == 1) {
            //view deadlinetasks
        }

        else if (input == 7) { terminate = true; }
    }

}
