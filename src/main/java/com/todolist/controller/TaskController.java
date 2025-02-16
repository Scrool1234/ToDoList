package main.java.com.todolist.controller;

import main.java.com.todolist.model.Task;
import main.java.com.todolist.service.TaskService;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskController {
    private TaskService taskService = new TaskService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("Выберите задачу: \n" +
                    "1. Добавить задачу\n" +
                    "2. Удалить задачу\n" +
                    "3. Обновить задачу\n" +
                    "4. Вывести список задач\n" +
                    "5. Выход");

            int numTask = scanner.nextInt();
            scanner.nextLine();

            switch (numTask) {
                case 1:
                    System.out.print("Введите название задачи: ");
                    String titleNewTask = scanner.nextLine();
                    System.out.print("Введите описание к задаче: ");
                    String description = scanner.nextLine();
                    Task task = new Task(titleNewTask, description);
                    taskService.addTask(task);
                    break;

                case 2:
                    System.out.print("Введите id задачаи которую хотите удалить: ");
                    int idDelTask = scanner.nextInt();
                    taskService.subTask(idDelTask);
                    break;

                case 3:
                    System.out.print("Напишите id задачи, котоую хотите обночить: ");
                    int idUpdateTask = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите название задачи: ");
                    String updateTask = scanner.nextLine();
                    System.out.print("Введите описание к задаче: ");
                    String updateDescription = scanner.nextLine();
                    Task newTask = new Task(updateTask, updateDescription);
                    taskService.updateTask(idUpdateTask, newTask);
                    break;

                case 4:
                    ArrayList<Task> tasks = taskService.getTasks();

                    for(Task ex: tasks) {
                        System.out.println("id задачи: " + ex.getId() +
                                "\nЗадача: " + ex.getTitle() +
                                "\nОписание задачи: " + ex.getDescription() +
                                "\nГотовность задачи: " + (ex.getCompleted() == false ? "не выполнена" : "выполнена"));
                        System.out.println();
                    }
                    break;

                case 5:
                     return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }

            System.out.println();
        }
    }
}
