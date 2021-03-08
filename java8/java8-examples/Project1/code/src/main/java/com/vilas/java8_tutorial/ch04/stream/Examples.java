package com.vilas.java8_tutorial.ch04.stream;

import com.vilas.java8_tutorial.domain.Task;
import com.vilas.java8_tutorial.domain.TaskType;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Examples {

	//Find all READING tasks (names) of tasks sorted by it's created date
    public List<String> allReadingTasks(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                sorted(comparing(Task::getCreatedOn)).
                map(Task::getTitle).
                collect(toList());

    }

	//Find all READING tasks (names) of tasks sorted in descending order by it's created date
    public List<String> allReadingTasksSortedByCreatedOnDesc(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                sorted(comparing(Task::getCreatedOn).reversed()).
                map(Task::getTitle).
                collect(toList());
    }

	//Find all distinct tasks
    public List<Task> allDistinctTasks(List<Task> tasks) {
        return tasks.stream().distinct().collect(toList());
    }

	//Find all n number of tasks sorted by it's creation date
    public List<String> topN(List<Task> tasks, int n) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                sorted(comparing(Task::getCreatedOn)).
                map(Task::getTitle).
                limit(n).
                collect(toList());
    }

    
	//Find the count of all READING tasks 
    public long countAllReadingTasks(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                count();
    }

    //Find all tasks with distinct tags
    public List<String> allDistinctTags(List<Task> tasks) {
        return tasks.stream().flatMap(task -> task.getTags().stream()).distinct().collect(toList());
    }

   //Find all READING tasks with Tag containing books.
    public boolean isAllReadingTasksWithTagBooks(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                allMatch(task -> task.getTags().contains("books"));
    }

    //Find all READING tasks with tag containing java8
    public boolean isAnyReadingTasksWithTagJava8(List<Task> tasks) {
        return tasks.stream().
                filter(task -> task.getType() == TaskType.READING).
                anyMatch(task -> task.getTags().contains("java8"));
    }

    //Create a string of all tasks separated by ***:
    public String joinAllTaskTitles(List<Task> tasks) {
        return tasks.stream().
                map(Task::getTitle).
                reduce((first, second) -> first + " *** " + second).
                get();
    }

}
