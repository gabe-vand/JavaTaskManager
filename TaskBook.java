import java.util.ArrayList;
import java.util.List;

public class TaskBook {
    private List<Task> tasks = new ArrayList<>();

    TaskBook(){}

    public void addTask(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return this.tasks;
    }
}
