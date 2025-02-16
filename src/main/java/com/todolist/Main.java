package main.java.com.todolist;


import main.java.com.todolist.controller.TaskController;
import main.java.com.todolist.model.Task;
import main.java.com.todolist.service.TaskService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TaskController controller = new TaskController();
        controller.start();
    }
}