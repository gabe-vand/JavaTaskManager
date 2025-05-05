
public class SimpleTask {
    private String type = "SimpleTask";
    private String name;
    private String description ;

    SimpleTask(String name, String description){
        this.name = name;
        this.description = description;
    }

    SimpleTask() {
        this.name = "Default Name";
        this.description = "Default Description";
    }

    public String getType(){
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String name) {
        this.description = name;
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

class DeadLineTask extends SimpleTask {
    private String type = "DeadLineTask";
    private String due_date;
    private String assigner;

    @Override
    public String getType() {
        return this.type;
    }

    DeadLineTask(String name, String description, String due_date, String assigner){
        super(name, description);
        this.due_date = due_date;
        this.assigner = assigner;
    }

    DeadLineTask() {
        this.due_date = "Default Due Date";
        this.assigner = "Default Assigner";
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
