package com.sdajava.Excercise_Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.sdajava.Excercise_Lambdas.Task;

import static com.sdajava.Excercise_Lambdas.Task.getTasks;
import static com.sdajava.Excercise_Lambdas.Task.taskName;

/**
 * Created by RENT on 2017-04-06.
 */
public class Excercise_Lambdas {

    public static void main (String[] args){
        List<Task> tasks = getTasks();
        List<String> titles = taskName(tasks);

        for (String title : titles){
            System.out.println(title);
        }
    }

    public static List<String> taskTitles (List<Task> tasks){
        List<String> readingTitles = new ArrayList<>();

        for(Task task : tasks){
            if(task.getType() == TaskType.READING){
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }

    }


