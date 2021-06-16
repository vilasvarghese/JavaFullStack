package com.vilas.java8_tutorial.ch10.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornCallJavascript {

	public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException {
		
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		
		try {
			engine.eval(new FileReader("D:\\code1\\myjava8\\src\\main\\java\\com\\vilas\\java8_tutorial\\ch10\\func.js"));//
			Invocable invocable=(Invocable)engine;
			
			Object result = invocable.invokeFunction("fun1", "Vilas Varghese");
			System.out.println(result);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
}
