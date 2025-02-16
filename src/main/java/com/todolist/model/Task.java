package main.java.com.todolist.model;

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public void setId(int id) {
        if(id >= 0) {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean getCompleted() {
        return isCompleted;
    }
}
