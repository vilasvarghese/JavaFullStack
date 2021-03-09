package com.vilas.java8_tutorial.ch04.stream;


import com.vilas.java8_tutorial.domain.Task;
import com.vilas.java8_tutorial.domain.TaskType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.vilas.java8_tutorial.utils.DataUtils.getTasks;


public class Example1_Stream {

    public static void main(String[] args) {
        List<Task> tasks = getTasks();

        List<String> readingTasks = tasks.stream()
        		.filter((t) -> t.getType() == TaskType.READING)
        		.sorted((o1, o2) -> o2.getTitle().length() - o1.getTitle().length())
        		.map(Task::getTitle)
        		.collect(Collectors.toList());
        //streams.forEach(System.out::println);

        
        System.out.println(readingTasks);
        
                /*.filter(task -> task.getType() == TaskType.READING)
                .sorted((t1, t2) -> t2.getTitle().length() - t1.getTitle().length())
                .map(Task::getTitle)
                .collect(Collectors.toList());*/

        //readingTasks.forEach(System.out::println);
    }
}
