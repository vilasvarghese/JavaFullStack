package com.vilas.java8_tutorial.ch05;



import com.vilas.java8_tutorial.ch05.domain.Task;

import sun.management.snmp.util.SnmpLoadedClassData;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskRepository {

    private static final Map<String, Task> db = new HashMap<>();

    public static void loadData() {
        db.put("1", new Task("1", "hello java 1"));
        db.put("2", new Task("2", "hello java 2"));
        db.put("3", new Task("3", "hello java 3"));
        db.put("4", new Task("4", "hello java 4"));
        db.put("5", new Task("5", "hello java 5"));
    }

    public static Task find(String id) {
        return Optional.ofNullable(db.get(id))
                .orElseThrow(() -> new TaskNotFoundException(id));
    }

    public static Task find1(String id) {
        return Optional.ofNullable(db.get(id)).orElse(new Task("Empty", "Empty"));
    }
    
    public static Optional<String> taskAssignedTo(String id) {
        return Optional.ofNullable(find(id))
                .flatMap(task -> task.getAssignedTo())
                .map(user -> user.getUsername());
    }
    
    public static void main(String[] args) {
    	
    	String s = new String();

    	 Optional<String> opt = Optional.ofNullable("vilas");
    	 System.out.println(opt);
    	 Optional<String> opt1 = Optional.ofNullable(null);
    	 System.out.println(opt1);

    	 loadData();
    	 System.out.println(find1("vilas"));
    	 System.out.println(find("1"));
    	 System.out.println(("2"));
    	 System.out.println("**************************** Expected Exception *****************************");
    	 find("vilas");
    }
}
