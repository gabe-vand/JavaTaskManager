import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TaskBook {
    private List<SimpleTask> tasks = new ArrayList<>();

    TaskBook(){}

    public void addTask(SimpleTask task){
        tasks.add(task);
    }

    public void createNewTask() {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        System.out.println("Will this task be simple or have a deadline?");
        input = Helper.fix_text(input);

        if (input.equals("simple")) {
            System.out.println("Enter a task title:");
            String name = Helper.fix_text(input);

            System.out.println("Enter a task description:");
            String desc = Helper.fix_text(input);

            tasks.add(new SimpleTask(name, desc));

        }

        else if (input.equals("deadline")) {
            System.out.println("Enter a task title:");
            String name = Helper.fix_text(input);

            System.out.println("Enter a task description:");
            String desc = Helper.fix_text(input);

            System.out.println("Enter a due date:");
            String due = Helper.fix_text(input);

            System.out.println("Enter an 'assigner' (what is this task for?):");
            String assigner = Helper.fix_text(input);

            tasks.add(new DeadLineTask(name, desc, due, assigner));
        }

        else { 
            System.out.println("Sorry, task type not recognized. Failed to create task.");
        }

        scanner.close();

    }

    public List<SimpleTask> getTasks() {
        return this.tasks;
    }

    public List<SimpleTask> get_task_type(String type) {
        // pass in "SimpleTask" for simple, and "DeadLineTask" for deadline.
        List<SimpleTask> correct_tasks = new ArrayList<>();

        for (SimpleTask task : tasks) {
            if (task.getType().equals(type)) {
                correct_tasks.add(task);
            }
        }

        return correct_tasks;
    }

    public void display_task_type(String type){
        List<SimpleTask> tasks = this.get_task_type(type);

        for (SimpleTask task : tasks) {
            System.out.println(task.getFormattedTask());
        }
    }

}
