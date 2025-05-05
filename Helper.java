package task_manager;

public final class Helper {
    private Helper(){}

    public static void clear_screen () {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }

}