package com.vilas.java8_tutorial.internationalization;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Internationalizer {
	public static void main(String args[]) throws Exception{
		/// printMessage(new Locale("en", "US"), "greetings");
		printMessage(new Locale("en", "IN"), "greetings");
		//newPrintMessage(new Locale("en", "IN"), "greetings");
		
		Locale locale = new Locale("en", "US");

		ResourceBundle labels = ResourceBundle.getBundle("Bundle", locale);

		System.out.println(labels.getString("greetings"));
	}

	public static void printMessage(Locale locale, String key) {
		// ResourceBundle myBund =
		// ResourceBundle.getBundle("D:/PraiseTheLord/HSBGInfotech/Others/vilas/JavaFullStack/java8/java8-examples/Project1/code/src/main/java/com/vilas/java8_tutorial/internationalization/Bundle",
		// locale);
		// ResourceBundle myBund1 =
		// ResourceBundle.getBundle("D:/PraiseTheLord/HSBGInfotech/Others/vilas/JavaFullStack/java8/java8-examples/Project1/code/src/main/java/com/vilas/java8_tutorial/internationalization/Bundle_en_IN.properties");

		// ResourceBundle myBund =
		// ResourceBundle.getBundle("main/java/com/vilas/java8_tutorial/internationalization/Bundle",
		// locale);

		try {
			FileInputStream fis = new FileInputStream(
					"D:/PraiseTheLord/HSBGInfotech/Others/vilas/JavaFullStack/java8/java8-examples/Project1/code/src/main/java/com/vilas/java8_tutorial/internationalization/Bundle_en_IN.properties");
			ResourceBundle resourceBundle = new PropertyResourceBundle(fis);
			System.out.println(resourceBundle.getString(key));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void newPrintMessage(Locale locale, String key) throws Exception{
		File file = new File("D://PraiseTheLord/HSBGInfotech//Others//vilas//JavaFullStack//java8//java8-examples//Project1//code//src//main//java//com/vilas//java8_tutorial//internationalization//Bundle");
		URL[] urls = {file.toURI().toURL()};
		ClassLoader loader = new URLClassLoader(urls);
		ResourceBundle myBund = ResourceBundle.getBundle("Bundle",Locale.getDefault(),loader);
		//System.out.println(myBund.getBaseBundleName());
		//System.out.println(myBund.getKeys());		
		//System.out.println(myBund.getString(key));

	}

}