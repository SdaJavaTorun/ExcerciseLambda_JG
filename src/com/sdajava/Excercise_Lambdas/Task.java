package com.sdajava.Excercise_Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-04-06.
 */
public class Task {

    private String title;
    private int taskId;
    private TaskType type;


    public Task(String title, int taskId, TaskType type) {
        this.title = title;
        this.taskId = taskId;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTaskId() {
        return taskId;
}

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    };

    public static List<Task> getTasks(){
        List<Task> list = new ArrayList<>();
        list.add(new Task("Wpisywanie", 1, TaskType.TAKE));
        list.add(new Task("Czytanie", 2, TaskType.READING));
        list.add(new Task("Oddawanie", 3, TaskType.GIVE));

        return list;
    }
    public static List<String> taskName(List<Task> list){
      return  list.stream().filter(s -> s.getType() == TaskType.READING).map(s -> s.getTitle()).collect(Collectors.toList());
    }

    public TaskType getType() {
        return type;
    }
}

