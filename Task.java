
public class Task {
    private String name;
    private String description;

    Task(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getFormattedTask(){
        String result = "";

        result += "Task Name: " + name + "\n" + "Description: " + description + "\n";

        return result;
    }
}

class DeadLineTask extends Task {
    private String due_date;
    private String assigner;

    DeadLineTask(String name, String description, String due_date, String assigner){
        super(name, description);
        this.due_date = due_date;
        this.assigner = assigner;
    }

    public String get_due_date() {
        return due_date;
    }

    public String get_assigner() {
        return assigner;
    }
    
    @Override
    public String getFormattedTask(){
        String result = "";

        result += "Task Name: " + super.getName() + "\n" + 
        "Assigner: " + assigner + " || " + "Due: " + due_date + "\n" +
        "Description: " + super.getDescription() + "\n";

        return result;
    }
}
