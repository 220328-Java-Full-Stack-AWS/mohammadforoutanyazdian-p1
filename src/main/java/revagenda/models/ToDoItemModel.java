package revagenda.models;

public class ToDoItemModel extends Model{
    private int itemId;
    private String task;
    private String date;
    private boolean completed;
    private int userId;

    public ToDoItemModel() {
    }

    public ToDoItemModel(int itemId, String task, String date, boolean completed, int userId) {
        this.itemId = itemId;
        this.task = task;
        this.date = date;
        this.completed = completed;
        this.userId = userId;
    }

    public ToDoItemModel(String task, String date, boolean completed, int userId) {
        this.task = task;
        this.date = date;
        this.completed = completed;
        this.userId = userId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return itemId + " - " + task  + " - " + date  + " - " + completed  + " - " + userId + "\n";
    }
}
