package main.java.com.todolist.service;

import main.java.com.todolist.model.Task;
import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
        System.out.println("Задача: \"" + task.getTitle() + "\" была добавлена");
    }

    public void subTask(int id) {
        boolean flag = false;
        int i = 0;
        for(Task ex: tasks) {
            if (ex.getId() == id) {
                tasks.remove(i);
                flag = true;
                System.out.println("Задача с id " + id + " удалена");
                break;
            }
            i++;
        }
        if(!flag) {System.out.println("Такой задачи нет в списке дел");}
    }

    public void updateTask(int id, Task newTask) {
        int i = 0;
        for(Task ex: tasks) {
            if (ex.getId() == id) {
                tasks.set(i, newTask);
                System.out.println("Задача с id " + id + " заменена");
                break;
            }
            i++;
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
