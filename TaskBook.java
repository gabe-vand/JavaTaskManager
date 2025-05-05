import java.util.ArrayList;
import java.util.List;


public class TaskBook {
    private List<SimpleTask> tasks = new ArrayList<>();

    TaskBook(){}

    public void addTask(SimpleTask task){
        tasks.add(task);
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

        String result = "";

        for (SimpleTask task : tasks) {
            result += task.getFormattedTask();
        }

        System.out.println(result);
    }

}
