package com.vilas.java8_tutorial.ch04.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Similar to group by in sql
//Use them for grouping objects by some property and storing results in a Map instance.
public class Example6_GroupBy {

    public static void main(String[] args) {
    	groupBy1();
    	groupBy2();
    }
    
    public static void groupBy1() {
        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        
        System.out.println(result);

        Map<String, Long> finalMap = new LinkedHashMap();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);
    }
    
    public static void groupBy2() {
        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("apple", 10, 9),
                new Item("banana", 20, 19),
                new Item("orang", 10, 29),
                new Item("watermelon", 10, 29),
                new Item("papaya", 20, 9),
                new Item("apple", 10, 9),
                new Item("banana", 10, 19),
                new Item("apple", 20, 9)
        );

        Map<String, Long> counting = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        
        System.out.println(counting);

        Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQuantity)));
        
        System.out.println(sum);
        

        //group by price
        Map<Integer, List<Item>> groupByPriceMap = 
            items.stream().collect(Collectors.groupingBy(Item::getCost));

        System.out.println(groupByPriceMap);

        // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<Integer, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(Item::getCost,
                                Collectors.mapping(Item::getName, Collectors.toSet())
                        )
                );

        System.out.println(result);
    }
}

class Item {
	private String name;
	private int quantity;
	private int cost;
	public Item(String name, int quantity, int cost) {
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}